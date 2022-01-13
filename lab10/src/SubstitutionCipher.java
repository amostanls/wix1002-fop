import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubstitutionCipher implements MessageEncoder{
    private String inputFile, outputFile;
    private int shift;

    public SubstitutionCipher(String inputFile, String outputFile, int shift) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.shift = shift;
    }

    public void encode() {
        try {
            Scanner in = new Scanner(new FileInputStream(inputFile));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile));
            while(in.hasNextLine()) {
                String tmp = in.nextLine();
                String cipher = encode(tmp);
                out.println(cipher);
            }
            in.close();
            out.close();
        }catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void decode() {
        try {
            Scanner in = new Scanner(new FileInputStream(inputFile));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile));
            while(in.hasNextLine()) {
                String tmp = in.nextLine();
                String plain = decode(tmp);
                out.println(plain);
            }
            in.close();
            out.close();
        }catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public String encode(String plainText) {
        StringBuilder res = new StringBuilder();
        // string == an array of characters
        for(char ch: plainText.toCharArray()) {
            res.append((char)(ch + shift));
        }
        return res.toString();
    }

    @Override
    public String decode(String cipherText) {
        StringBuilder res = new StringBuilder();
        for(char ch: cipherText.toCharArray()) {
            res.append((char)(ch - shift));
        }
        return res.toString();
    }
}

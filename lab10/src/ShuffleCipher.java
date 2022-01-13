import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

// abcde -> acbde
// abcde -> ab, cde
// acbde

// abcdef -> abc, def
// adbecf (first shuffle)
// adbecf -> adb, ecf
// aedcbf (second shuffle)
// ...

public class ShuffleCipher implements MessageEncoder{
    private String inputFile, outputFile;
    private int N;

    public ShuffleCipher(String inputFile, String outputFile, int n) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
        N = n;
    }

    public void encode() {
        try {
            Scanner in = new Scanner(new FileInputStream(inputFile));
            PrintWriter out = new PrintWriter(new FileOutputStream(outputFile));
            while(in.hasNextLine()) {
                String tmp = in.nextLine();
                for(int i=0; i<N; i++)
                    tmp = encode(tmp);
                out.println(tmp);
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
                for(int i=0; i<N; i++)
                    tmp = decode(tmp);
                out.println(tmp);
            }
            in.close();
            out.close();
        }catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public String encode(String plainText) {
        // abcde -> acbde
        int n = plainText.length();
        int half = n/2;
        // abcdefg
        // 0123456

        // substring(0,2) = "ab" -> 01
        // substring(2,6) = "cdef" -> 2345
        String s1 = plainText.substring(0, half);
        String s2 = plainText.substring(half);

        StringBuilder res = new StringBuilder();
        for(int i=0; i<n-n%2; i++) {
            // why n-n%2, when n is odd
            // n is even, not be affected
            if(i%2==0) {
                res.append(s1.charAt(i/2));
            }else {
                res.append(s2.charAt(i/2));
            }
        }

        // i = 0, i/2 = 0 (s1)
        // i = 1, i/2 = 0 (s2)
        // i = 2, i/2 = 1 (s1)
        // i = 3, i/2 = 1 (s2)
        // i = 4, i/2 = 2 (s1)

        if(n%2==1) {
            res.append(s2.charAt(s2.length()-1));
        }
        return res.toString();
    }

    @Override
    public String decode(String cipherText) {
        // acbde -> abcde
        int n = cipherText.length();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        // n is odd, no need look at last character
        for(int i=0; i<n-n%2; i++) {
            if(i%2==0) s1.append(cipherText.charAt(i));
            else s2.append(cipherText.charAt(i));
        }
        if(n%2==1)s2.append(cipherText.charAt(n-1));
        return s1.toString()+s2.toString();
    }
}

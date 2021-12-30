import java.io.*;
import java.util.Scanner;

public class l7q3 {
    public static void main(String[] args) {
        String random = "";

        try {
            Scanner input = new Scanner(new FileInputStream("random.txt"));
            while(input.hasNextLine()) {
                random += input.nextLine();
                random += "\n";
            }
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

        String[] contents = random.split("\n");

        try {
            PrintWriter output = new PrintWriter(new FileOutputStream("reverse.txt"));
            for(int i=0; i<contents.length; i++) {
                String tmp = contents[i];
                for(int j=tmp.length()-1; j>=0; j--) {
                    output.write(tmp.charAt(j));
                }
                output.write('\n');
            }
            output.close();
        }catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}

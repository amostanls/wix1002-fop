import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class l7q4 {
    public static void main(String[] args) {
        int charcnt = 0;
        int wordcnt = 0;
        int linecnt = 0;
        
        try {
            Scanner input = new Scanner(new FileInputStream("random.txt"));

            while(input.hasNextLine()) { 
                String sentence = input.nextLine();
                linecnt++;
                for(int i = 0; i < sentence.length(); i++) {
                    if(Character.isLetter(sentence.charAt(i)) || Character.isDigit(sentence.charAt(i))) {
                        charcnt++;
                    }
                }

                wordcnt += sentence.split(" ").length;
                // split into an array of strings
                // interested in only the size of the arrays -> num of words in sentence.
            }

            System.out.println("Number of characters: "+charcnt);
            System.out.println("Number of words: "+wordcnt);
            System.out.println("Number of lines: "+linecnt);
            input.close();
        }catch(FileNotFoundException e) {
            System.out.println("File was not found");
        }

    }
}

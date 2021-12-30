import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new FileInputStream("test.txt"));
            in.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

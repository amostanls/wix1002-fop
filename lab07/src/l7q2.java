import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;

public class l7q2 {
    public static void main(String[] args) {
        String filename = "index.htm";
        StringBuilder content = new StringBuilder();
        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            while(in.hasNextLine()){
                content.append(in.nextLine());
            }

            PrintWriter output = new PrintWriter(new FileOutputStream(filename));
            output.write(content.toString());
            output.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class l7q1 {
    public static void main(String[] args) throws IOException {
        String[][] courses = {
                {"WXES1116","Programming I"},
                {"WXES1115","Data Structure"},
                {"WXES1110","Operating System"},
                {"WXES1112","Computing Mathematics I"}
        };

        String filename = "coursename.dat";
        // store the courses data into file
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename));
            for(int i=0; i< courses.length; i++) {
                output.writeUTF(courses[i][0]+","+courses[i][1]);
            }
            output.close();
        }catch (IOException e) {
            System.out.println("Problem with file output");
        }

        // retrieve data from `coursename.dat`
        String[][] data = new String[4][2];
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename));
            for(int i=0; i<data.length; i++) {
                String tmp = input.readUTF();
                data[i] = tmp.split(",", 2);
            }
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }catch (IOException e) {
            System.out.println("Error reading the file");
        }

        // prompt user for course code
        System.out.print("Course Code: ");
        String coursecode = new Scanner(System.in).nextLine();
        String coursename = "";

        // find course name based on course code
        for(int i=0; i< data.length; i++) {
            if(data[i][0].equals(coursecode)){
                coursename = data[i][1];
            }
        }

        // output
        if(coursename.equals("")){
            System.out.println("Course Code is not found");
        }else {
            System.out.println(coursecode + ": " + coursename);
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class t7q3 {
    public static void main(String[] args) {
        String str = "Introduction to Java Programming!";
        byte[] bytes = str.getBytes();
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
            for (byte b : bytes) {
                int val = b;

                for(int i=7; i>=0; i--) {
                    if(((val>>i)&1)==1) {
                        outputStream.print("1");
                    }else {
                        outputStream.print("0");
                    }
                }

//                for (int i = 0; i < 8; i++) {
//                    if( (val&128)==0)
//                        outputStream.print("0");
//                    else
//                        outputStream.print("1");
//                    val <<= 1;
//                }
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        System.out.print("The sentence is :");
        try {
            Scanner inputStream = new Scanner(new FileInputStream ("data.txt"));
            String temp, str1="";
            if (inputStream.hasNext()) {
                temp = inputStream.next();
                for (int i = 0; i < temp.length()/8; i++) {
                    int a = Integer.parseInt(temp.substring(8*i,(i+1)*8), 2);
                    str1 += (char)(a);
                }
                System.out.println(str1);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}

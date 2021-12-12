import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class l5q3 {
    public static void main(String[] args) {
        System.out.print("Number of employees: ");
        int n = new Scanner(System.in).nextInt();

        Random rnd = new Random();

        int[][] hours = new int[n][7];

        for(int i=0; i<n; i++) {
            for(int j=0; j<7; j++) {
                hours[i][j] = rnd.nextInt(8)+1;
                // [0,7] + 1 -> [1,8]
            }
        }

        String[] dow = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        System.out.print("Employee\t");
        for(int i=0; i<7; i++)
            System.out.print(dow[i]+"\t");
        System.out.println("Total hours");
        for(int i=0; i<n; i++) {
            System.out.print(i+1+"\t\t\t");
            int sum = 0;
            for(int j=0; j<7; j++) {
                System.out.print(hours[i][j] + "\t");
                sum += hours[i][j];
            }
            System.out.println(sum);
        }
    }
}

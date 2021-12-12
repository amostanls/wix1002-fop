import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class l5q1 {
    public static void main(String[] args) {
        System.out.print("Number of students: ");
        int n = new Scanner(System.in).nextInt();
        int[] scores = new int[n];
        Random rnd = new Random();

        int mn = 100; // lowest score
        int mx = 0;   // highest score
        int sum = 0;  // sum of scores, use for calculating average
        for(int i=0; i<n; i++) {
            scores[i] = rnd.nextInt(101);
            sum += scores[i];
            if(scores[i]<mn)mn=scores[i];
            if(scores[i]>mx)mx=scores[i];
        }

        // print scores
        // Method 1
        for(int i=0; i<n; i++) {
            if(i>0) System.out.print(", ");
            System.out.print(scores[i]);
        }
        System.out.println();
        // Method 2
        for(int x:scores)
            System.out.print(x+" ");
        System.out.println();
        // Method 3
        System.out.println(Arrays.toString(scores));

        double average = (double) sum /n;
        System.out.printf("%s %d\n", "Highest Score: ", mx);
        System.out.printf("%s %d\n", "Lowest Score: ", mn);
        System.out.printf("%s %.2f\n", "Average Score: ", average);
    }
}

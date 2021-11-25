import java.util.Scanner;

import static java.lang.Math.sqrt;

public class l4q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum=0, sum_2=0;
        // sum: sum of x
        // sum_2: sum of x^2

        int mn = 0;
        int mx = 0;
        int n=0;
        // n: number of scores

        while(true) {
            System.out.print("Enter a score [negative score to quit]:");
            num = in.nextInt();
            if (num < 0) break;
            // num >= 0, a valid score
            n++;
            if(n==1) {
                mn = num;
                mx = num;
            }
            sum += num;
            sum_2 += num * num;
            if (mn > num) mn = num;
            if (mx < num) mx = num;
        }
        double average = (double) sum/n;

        double var = (sum_2 - (double)(sum * sum)/n)/(n-1);
        double std = sqrt(var);

        System.out.printf("%s %.1f\n", "Variance:", var);
        System.out.printf("%s %d\n", "Minimum Score:", mn);
        System.out.printf("%s %d\n", "Maximum Score:", mx);
        System.out.printf("%s %.2f\n", "Average Score:", average);
        System.out.printf("%s %.2f\n", "Standard Deviation:", std);
    }
}

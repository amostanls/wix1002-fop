import java.util.Scanner;

public class l2q6 {
    public static void main(String[] args) {
        // Q = M * (final temperature – initial temperature) * 4184
        // M = Weight of water in kg
        // Q = Energy in joules
        Scanner in = new Scanner(System.in);

        // take inputs for M, initial temp and final temp
        System.out.print("Enter the amount of water in gram: ");
        double M = in.nextDouble();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double temp_initial = in.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double temp_final = in.nextDouble();

        // Calculation
        M = M / 1000; // kg
        // Celsius = (Fahrenheit – 32) / 1.8
        temp_initial = (temp_initial - 32) / 1.8;
        temp_final = (temp_final - 32) / 1.8;

        double Q = M * (temp_final-temp_initial) * 4184;

        // Output
        // e = x10^x
        System.out.printf("The energy needed is %.6e %n", Q);
//        System.out.printf("The energy needed is %.10g %n", Q); // round off
    }
}

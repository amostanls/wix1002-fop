import java.util.Scanner;

public class l4q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // FORMULA 1
        double M; // (OUTPUT) monthly payment
        double P; // (INPUT) principal
        double i; // (INPUT) yearly interest rate in %
        double N; // (INPUT) total number of months

        // FORMULA 2
        double C; // (OUTPUT) principal portion due
        double n; // (OUTPUT) month under consideration
        double L; // (OUTPUT) interest due OR interest
        double R; // (OUTPUT) remaining principal balance due OR unpaid balance
        double totalInterest = 0;

        // input
        System.out.print("Enter principal amount: ");
        P = in.nextDouble();
        System.out.print("Enter interest in %: ");
        i = in.nextDouble();
        System.out.print("Enter total number of month(s): ");
        N = in.nextInt();

        // FORMULA 1
        M = (P * (i / (1200))) / (1 - Math.pow(1 + i / 1200, -N));

        // more info at: https://www.cypress.com/file/54441/download
        // although it's for C, but should be roughly the same
        System.out.printf("%-10s %18s %18s %18s %18s %18s\n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        for(int month = 1; month <= N; month++) {
            // FORMULA 2
            n = month;
            C = M * Math.pow(1 + i / 1200, -(1 + N - n));
            L = M - C;
            R = L / (i / 1200) - C;
            totalInterest += L;
            System.out.printf("%-10d %18.2f %18.2f %18.2f %18.2f %18.2f\n", month, M, C, L, R, totalInterest);
        }

    }
}

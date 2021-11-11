import java.util.Scanner;

public class l2q2 {
    public static void main(String[] args) {
        /*
            P: The price of the car
            D: Down payment
            R: Interest Rate in %
            Y: Loan duration in year
            M: Monthly Payment
            M = (P – D) * (1 + R*Y/100) / (Y *12)
         */

        // Take inputs for P,D,R,Y
        Scanner in = new Scanner(System.in);
        System.out.print("The price of the car in RM: ");
        double P = in.nextDouble();
        System.out.print("Down payment in RM: ");
        double D = in.nextDouble();
        System.out.print("Interest Rate in %: ");
        double R = in.nextDouble();
        System.out.print("Loan duration in year: ");
        double Y = in.nextDouble();

        // calculate M
        double M = (P-D) * (1+R*Y/100) / (Y*12);
        System.out.printf("%s %.2f\n", "Monthly Payment in RM: ", M);
    }
}

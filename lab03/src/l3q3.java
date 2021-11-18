import java.util.Scanner;

public class l3q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sales Volume: RM ");
        int sales_v = in.nextInt();
        double commision = 0;
        if(sales_v <= 100) {
            commision = (double) sales_v * 0.05;
        }else if(sales_v <= 500) {
            commision = (double) sales_v * 0.075;
        }else if(sales_v <= 1000) {
            commision = (double) sales_v * 0.1;
        }else {
            commision = (double) sales_v * 0.125;
        }
        System.out.printf("Commision: RM %.2f",commision);
    }
}

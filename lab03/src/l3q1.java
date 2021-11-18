import java.util.Scanner;

public class l3q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two integers number: ");
        int a = in.nextInt();
        int b = in.nextInt();
        in.nextLine(); //captures the enter \n

        System.out.print("Enter the operand: ");
        String op = in.nextLine();
        char operand = op.charAt(0);

        double res = 0;
        if (operand == '+') {
            res = a + b;
        }else if(operand == '-') {
            res = a - b;
        }else if(operand == '*') {
            res = a * b;
        }else if(operand == '/') {
            res = (double) a / b;
        }else if(operand == '%') {
            res = a % b;
        }
        System.out.printf("%d %c %d = %.2f", a, operand, b, res);


//        Method 2
//        System.out.print("Enter two integers number: ");
//        String tmp = in.nextLine();
//        String[] arr = tmp.split(" ");
//        int a = Integer.parseInt(arr[0]);
//        int b = Integer.parseInt(arr[1]);
//
//        System.out.print("Enter the operand: ");
//        String op = in.nextLine();
//        char operand = op.charAt(0);
//
//        double res = 0;
//        boolean has_decimal = false;
//        if (operand == '+') {
//            res = a + b;
//        }else if(operand == '-') {
//            res = a - b;
//        }else if(operand == '*') {
//            res = a * b;
//        }else if(operand == '/') {
//            res = (double) a / b;
//            if ( (int)res * b != a) {
//                has_decimal = true;
//            }
//        }else if(operand == '%') {
//            res = a % b;
//        }
//
//        if (has_decimal == true) {
//            System.out.printf("%d %c %d = %.2f", a, operand, b, res);
//        }else {
//            System.out.printf("%d %c %d = %.0f", a, operand, b, res);
//        }
    }
}

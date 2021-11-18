import java.util.Scanner;

public class l3q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0,b=0,c=0,d=0,e=0,f=0;
//        System.out.print("a = ");
//        a = in.nextInt();
//        System.out.print("b = ");
//        b = in.nextInt();
//        System.out.print("c = ");
//        c = in.nextInt();
//        System.out.print("d = ");
//        d = in.nextInt();
//        System.out.print("e = ");
//        e = in.nextInt();
//        System.out.print("f = ");
//        f = in.nextInt();

        char[] input = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] values = new int[6];
        for(int i=0; i<6; i++) {
            System.out.print(input[i]+" = ");
            values[i] = in.nextInt();
        }
        a = values[0];
        b = values[1];
        c = values[2];
        d = values[3];
        e = values[4];
        f = values[5];

        if(a*d == b*c) {
            System.out.println("The equation has no solution");
            return;
        }

        double x = (double)(d*e - b*f)/(a*d - b*c);

        //d*e - b*f
        // = 1*10 - 2*6
        // = 10 - 12
        // = -2

        // a*d - b*c
        // = 3*1 - 2*9
        // = 3 - 18
        // = -15

        // (-2)/(-15)
        // 0.00 if didn't use double, it uses int/int
        // -2.0000/-15 = 0.13

        double y = (double)(a*f - c*e)/(a*d - b*c);
        System.out.printf("x = %.2f\n",x);
        System.out.printf("y = %.2f\n",y);
    }
}


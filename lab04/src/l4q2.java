import java.util.Scanner;

public class l4q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        // Method 1
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=i; j++) {
//                sum += j;
//            }
//        }
        // i = 1, j = 1          = 1
        // i = 2, j = 1, 2       = 3
        // i = 3, j = 1, 2, 3    = 6
        // i = 4, j = 1, 2, 3, 4 = 10

        // n = 1, sum = 1
        // n = 2, sum = 4
        // n = 3, sum = 10
        // n = 4, sum = 20

        // Method 2
//        for(int i=1; i<=n; i++) {
//            sum += (1+i)*(i)/2;
//        }
        // i = 1, 1
        // i = 2, 3
        // i = 3, 6

        // Method 3
//        int tmp=0;
//        for(int i=1; i<=n; i++) {
//            tmp += i;
//            sum += tmp;
//        }
        //1st iteration: tmp=(1), sum=1
        //2nd iteration: tmp=1+(2) = 3, sum=4
        //3rd iteration: tmp=3+(3) = 6, sum=10

        // Method 4
        //https://www.quora.com/How-can-you-find-the-sum-of-this-series-1-1-2-1-2-3-Upto-n-terms
        sum = n*(n+1)*(n+2)/6;
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class l2q4 {
    public static void main(String[] args) {
        // Take input
        System.out.print("Enter the number of seconds: ");
        int t = new Scanner(System.in).nextInt();

        // Scanner in = new Scanner(System.in);
        // int t = in.nextInt();

        // Calculate for h,m,s
        //Method 1
        int h = t / 3600;
        int m = (t%3600) / 60; // t%3600 -> leftovers (minutes and seconds) / 60 -> minutes
        int s = (t%3600) % 60; // t%3600 -> leftovers (minutes and seconds) % 60 -> seconds

        // (t%3600) % 60 == t % 60
        // t = 3905
        // t%3600 = 305
        // (t%3600) % 60 = 5

          // Method 2
//        int ori_t = t;
//        // hours -> minutes -> seconds
//        int h = t/3600;
//        t -= h*3600;
//        // leftover (in seconds) -> calculation for minutes & seconds
//        int m = t/60;
//        t -= m*60;
//        // leftover -> seconds
//        int s = t;
//        t = ori_t;

        // Display output
        System.out.printf("%d %s %d %s %d %s %d %s\n", t, "seconds is", h, "hours,", m, "minutes and", s, "seconds");
    }
}

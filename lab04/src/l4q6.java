import java.util.Random;

public class l4q6 {
    public static void main(String[] args) {
        int n = new Random().nextInt();
        // n = the random generate number
        if(n<0)n = -n;
        int ori = n;
        // ori = original value of n

        int cnt = 0;
        // cnt = count
        while(n>0) {
            n/=10;
            cnt++;
        }
        //21185 -> 2118, cnt=1
        // 2118 ->  211, cnt=2
        //  211 ->   21, cnt=3
        //   21 ->    2, cnt=4
        //    2 ->    0, cnt=5
        // 0 > 0 (false)

        System.out.println("Number of digits of "+ori+": "+cnt);
    }
}

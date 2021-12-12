import java.util.Random;

public class l4q8 {
    public static void main(String[] args) {
        int n = new Random().nextInt(101);
        int cnt = 0; // current number of prime numbers
        int curr = 2; // current number
        System.out.println("First "+n+" prime numbers: ");
        while(cnt<n) {
            boolean prime = true;
            // Method 1
//            for(int i=2; i<curr; i++) {
//                if(curr%i==0) {
//                    prime=false;
//                    break;
//                }
//            }
            // 2 -> (curr-1)

            // Method 2
            for(int i=2; i*i<=curr; i++) {
                if(curr%i==0) {
                    prime=false;
                    break;
                }
            }
            // 2 -> sqrt(curr)
            // i<=sqrt(curr) -> i*i <= curr

            if(prime) {
                System.out.print(curr+" ");
                cnt++;
            }
            curr++;
        }
        System.out.println();
    }
}

/*
why i*i <= curr -> i <= sqrt(curr)?

24 = 1 x 24
   = 2 x 12
   = 3 x 8
   = 4 x 6

9  = 1 x 9
   = 3 x 3
 */
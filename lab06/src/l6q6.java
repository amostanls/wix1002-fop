public class l6q6 {
    public static void main(String[] args) {
        {
            System.out.println("Palindromic Primes:");
            int cnt = 0;
            // current number of palindromic primes
            int p = 2;
            while (cnt < 20) {
                if (isPalindromicPrime(p)) {
                    System.out.println(p);
                    cnt++;
                }
                p++;
            }
        }
        {
            System.out.println("Emirp:");
            int cnt = 0;
            // current number of emirp
            int p = 2;
            while (cnt < 20) {
                if (isEmirp(p)) {
                    System.out.println(p);
                    cnt++;
                }
                p++;
            }
        }
    }

    public static boolean isPalindromicPrime(int n) {
        if( n == reverse(n) && isPrime(n))return true;
        return false;
    }

    public static boolean isEmirp(int n) {
        if(isPrime(n) && isPrime(reverse(n)) && isPalindromicPrime(n)==false)return true;
        return false;
    }

    public static int reverse(int n) {
        int res = 0;
        while(n>0) {
            res *= 10;
            res += n%10;
            n/=10;
        }
        return res;
    }

    public static boolean isPrime(int n) {
        for(int i=2; i*i<=n; i++) {
            if(n%i==0)return false;
        }
        return true;
    }
}

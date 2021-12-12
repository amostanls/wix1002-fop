public class l6q6 {
    public static void main(String[] args) {
        int cnt = 0;
        int curr = 1;
        while(cnt<20) {
            if (checkEmirp(curr)) {
                cnt++;
                System.out.println(curr);
            }
            curr++;
        }
    }

    public static boolean checkEmirp(int x) {
        return checkPrime(x) && checkPrime(reverse(x));
    }

    public static int reverse(int x) {
        int res = 0;
        while(x>0) {
            res *= 10;
            res += x%10;
            x/=10;
        }
        return res;
    }

    public static boolean checkPrime(int x) {
        if(x==1)return false;
        for(int i=2; i*i<=x; i++) {
            if(x%i==0)return false;
        }
        return true;
    }
}

public class l6q1 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++) {
            System.out.println(triangle(i));
        }
    }

    public static int triangle(int n) {
        // method 1
//        int sum = 0;
//        for(int i=1; i<=n; i++)
//            sum += i;
//        return sum;

        // method 2
        return (n + 1) * n / 2;
    }
}

import java.util.Scanner;

public class l4q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int n = in.nextInt();
        System.out.print("The factors are: ");
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                if(i==n) System.out.println(i);
                else System.out.print(i+", ");
            }
        }
    }
}

import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        long P = 880000000L;
//        System.out.println(P);
//
//        long P2 = 880000000;
//        System.out.println(P2);
//
//        BigInteger P3 = new BigInteger("880000000");
//        System.out.println(P3);
//        int num1 = 19;
//        int num2 = 21;
//        int num3 = 32;
//        System.out.println(num1+" "+num1%3);
//        System.out.println(num2+" "+num2%3);
//        System.out.println(num3+" "+num3%3);
//        int[] arr = new int[5];
//        Scanner in = new Scanner(System.in);
//        for(int i=0; i<5; i++) {
//            System.out.print("Enter a number: ");
//            arr[i] = in.nextInt();
//        }
//        System.out.println("Your array:");
//        for(int i=0; i<5; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
        Random rnd = new Random();
        // 0 to 50
        // range = max - min + 1 = 50 - 0 + 1 = 51
        int num = rnd.nextInt(51); // 0,1,2,...,50
        System.out.println(num);
    }
}

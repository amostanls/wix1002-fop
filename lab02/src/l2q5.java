import java.util.Random;

public class l2q5 {
    public static void main(String[] args) {
        // Generate a random number
        int num = new Random().nextInt(10001); //0-10000

        System.out.println("Number: "+num);

        //123
        int sum = 0;
//                num/10000 +      // 5th digit, 0
//                (num%10000)/1000 + // 4th digit [0-9999], 123/1000 -> 0
//                (num%1000)/100 +   // 3rd digit [0-999], 123/100 -> 1
//                (num%100)/10 +     // 2nd digit [0-99], 23/10 -> 2
//                num % 10;          // 1st, 3

        while(num>0) {
            sum += num%10;
            num /= 10;
        }

        // 9812, 2
        // 981, 1
        // 98, 8
        // 9, 9
        // 9/10 = 0

        System.out.println("Sum of digits: "+sum);
    }
}
//            System.out.println(num+" "+num%10+" "+sum);



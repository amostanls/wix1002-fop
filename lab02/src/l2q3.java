import java.util.Random;

public class l2q3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        // Generate 3 random numbers between 10 and 50
        int[] a = new int[3];

        for(int i=0; i<3; i++) {
            a[i] = rnd.nextInt(41)+10;
            //0,1,2
        }

        // Sum and average of the 3 random numbers generated
        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += a[i];
        }
        double average = (double)sum/3;

        // Display 3 values, sum and average
        for(int i=0; i<3; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println("Sum: "+sum);
        System.out.printf("%s %.2f\n", "Average: ",average);
    }
}


/*
    int min = 10;
    int max = 50;
    num = rnd.nextInt(max-min+1)+min;
 */

/*

 */

/*
        int num1 = rnd.nextInt(41)+10;
        // Range = [10,50]
        // rnd.nextInt(41) -> [0,40]
        // rnd.nextInt(41)+10 -> [10,50]
        int num2 = rnd.nextInt(41)+10;
        int num3 = rnd.nextInt(41)+10;

        System.out.println("Number 1: "+num1);
        System.out.println("Number 2: "+num2);
        System.out.println("Number 3: "+num3);

        int sum = num1 + num2 + num3;
        System.out.println("Sum: "+sum);

        double average = (double) sum / 3;
        System.out.printf("%s %.2f\n", "Average: ", average);
 */
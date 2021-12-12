import java.util.Random;

public class l5q2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean[] taken = new boolean[21];
        for(int i=0; i<10; i++) {
            int num;
            // check if it is taken
            do {
                num = rnd.nextInt(21);
            }while(taken[num]);

            taken[num] = true;
            if(i>0) System.out.print(", ");
            System.out.print(num);
        }
        System.out.println();
    }
}

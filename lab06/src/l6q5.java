import java.util.Random;
import java.util.Scanner;

public class l6q5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int score = 0;
        while(true) {
            System.out.println("Enter negative number to quit.");
            int x = rnd.nextInt(13);
            int y = rnd.nextInt(13);
            System.out.print(x+" x "+y+" = ");
            int res = in.nextInt();
            if(res<0)break;
//            else score += (check(x,y,res)==true?1:0);
            else {
                if(check(x,y,res)==true)
                    score+=1;
                else
                    score+=0;
            }
        }
        System.out.println("Your Score is "+score);
    }

    public static boolean check(int x, int y, int z) {
//        return x*y==z;
        if(x*y==z)return true;
        else return false;
    }
}

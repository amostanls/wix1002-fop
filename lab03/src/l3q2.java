import java.util.Random;

public class l3q2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(6);
        System.out.print(x + " is ");
        if(x==0) {
            System.out.println("zero");
        }else if(x==1) {
            System.out.println("one");
        }else if(x==2) {
            System.out.println("two");
        }else if(x==3) {
            System.out.println("three");
        }else if(x==4) {
            System.out.println("four");
        }else {
            System.out.println("five");
        }
    }
}

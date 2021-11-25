import java.util.Random;
import java.util.Scanner;

public class l4q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int p1_score = 0;
        int p2_score = 0;
        // p1_score = Player 1's score
        // p2_score = Player 2's score
        while(p1_score<=100 && p2_score <=100) {
            System.out.println("Player 1's turn");
            int outcome;
            // outcome = outcome of the die
            do {
                outcome = rnd.nextInt(6)+1;
                // outcome of Player 1
                p1_score += outcome;
                System.out.printf("%s %d, %s %d\n", "outcome:", outcome, "Player 1's score:",p1_score);
            }while(outcome==6 && p1_score<=100);
            if(p1_score>100)break;
            System.out.println();

            System.out.println("Player 2's turn");
            do {
                outcome = rnd.nextInt(6)+1;
                // outcome of Player 2
                p2_score += outcome;
                System.out.printf("%s %d, %s %d\n", "outcome:", outcome, "Player 2's score:",p2_score);
            }while(outcome==6 && p2_score<=100);
            if(p2_score>100)break;
            System.out.println();

            System.out.println("Player 1's score: " + p1_score);
            System.out.println("Player 2's score: " + p2_score);
            System.out.println();

            System.out.println("Press enter to continue");
            in.nextLine();
        }

        System.out.println("--------------");
        if(p1_score>p2_score)
            System.out.println("Player 1 wins");
        else
            System.out.println("Player 2 wins");
    }
}

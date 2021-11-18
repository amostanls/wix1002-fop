import java.util.Random;

public class l3q4 {
    public static void main(String[] args) {
        Random rdm = new Random();
        int p1_score = 0;
        int p2_score = 0;
        int tempScore = 0;

        System.out.println("Player 1:");
        for(int i = 0; i < 2; i++) {
            tempScore = rdm.nextInt(6) + 1; // 1 to 6
            System.out.printf("Dice %d: %d \n", i+1, tempScore);
            p1_score += tempScore;
        }
        System.out.println("Player 1's score: " + p1_score + "\n");

        System.out.println("Player 2:");
        for(int i = 0; i < 2; i++) {
            tempScore = rdm.nextInt(6) + 1; // 1 to 6
            System.out.printf("Dice %d: %d \n", i+1, tempScore);
            p2_score += tempScore;
        }
        System.out.println("Player 2's score: " + p2_score);

        // compare
        if(p1_score > p2_score) {
            System.out.println("Player 1 wins");
        }else if(p1_score < p2_score) {
            System.out.println("Player 2 wins");
        }else {
            System.out.println("Draw");
        }
    }
}

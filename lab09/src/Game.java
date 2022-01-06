import java.util.Random;
import java.util.Scanner;

public abstract class Game {
    protected Player player1, player2;
    protected abstract void play(Player player);
    public Random rnd = new Random();

    public Game(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        String winner;
        while(player1.getScore()<100 && player2.getScore()<100) {
            play(player1);
            if(player1.getScore()>=100)break;
            play(player2);
            System.out.println("--- Scoreboard ---");
            System.out.println(player1.toString());
            System.out.println(player2.toString());

            System.out.print("Press 'Enter' to continue");
            new Scanner(System.in).nextLine();
            // use to temporarily stop to view the scoreboard (know current scores)
        }

        if(player1.getScore()>=100)
            winner = player1.getName();
        else
            winner = player2.getName();

        System.out.println("--- Final Scoreboard ---");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
        System.out.println("Winner is "+winner);
    }
}
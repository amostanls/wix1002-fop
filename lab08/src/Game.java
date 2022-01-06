import java.util.Random;

public class Game {
    private String name;
    private int score;

    public Game(String name) {
        this.name = name;
        this.score = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void roll() {
        int tmp = new Random().nextInt(6)+1; //[1,6]
        System.out.println("Dice: "+tmp);
        score+=tmp;
    }

    public void display() {
        System.out.println(name+"'s score is " + score);
    }
}

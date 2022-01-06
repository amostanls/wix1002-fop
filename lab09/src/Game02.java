public class Game02 extends Game{
    public Game02(String name1, String name2) {
        super(name1, name2);
    }

//    The second dice game allows the player to roll one dice each time.
//    When the dice is 6, the player can roll one more time.
//    However, if the player rolls 6 again in second attempt,
//    the player won’t have any score.
    @Override
    public void play(Player player) {
        int first_roll = rnd.nextInt(6)+1; //[1,6]
        System.out.println(player.getName()+"'s first roll: "+first_roll);
        if(first_roll!=6) {
            // doesn't have another roll
            player.setScore(player.getScore() + first_roll);
            return;
        }
        // first roll = 6
        int second_roll = rnd.nextInt(6)+1;
        System.out.println(player.getName()+"'s second roll: "+second_roll);
        if(second_roll==6)return;
        player.setScore(player.getScore()+first_roll+second_roll);
        return;
    }
}




public class Game01 extends Game{
    public Game01(String name1, String name2) {
        super(name1, name2);
    }

//    The first dice game allows the player to roll two dices each time.
//    If both dice is equal, the player can roll again
    @Override
    public void play(Player player) {
        int first_roll = rnd.nextInt(6)+1; //[1,6]
        int second_roll = rnd.nextInt(6)+1;
        System.out.println(player.getName()+"'s first roll: "+first_roll);
        System.out.println(player.getName()+"'s second roll: "+second_roll);

        player.setScore(player.getScore()+first_roll+second_roll);
        if(first_roll==second_roll)play(player);
        return;
    }
}
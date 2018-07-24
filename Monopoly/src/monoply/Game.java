package monoply;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> player = new ArrayList<Player>(8);
    private Board board = new Board();
    private Die die = new Die();

    public Game(ArrayList<Player> player)
    {
        if(player.size()<9&&player.size()>1)
        this.player=player;
    }
    public int getNumberOfPlayer() {
        return player.size();
    }
}

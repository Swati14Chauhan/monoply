import monoply.Game;
import monoply.Player;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {

 private ArrayList<Player> player = new ArrayList<Player>();
 private Player play = new Player();
 @Test
 public void gameShouldNotHaveLessThan2Player(){

  player.add(play);
  Game game = new Game(player);
  assertFalse(game.getNumberOfPlayer()>1);

 }

 @Test
 public void gameShouldHaveMinimum2Player(){

  for(int i=0;i<5;i++)
     player.add(play);
  Game game = new Game(player);
     assertTrue(game.getNumberOfPlayer()>1&&game.getNumberOfPlayer()<9);

 }

 @Test
 public void gameShouldNotHaveMoreThan8Player(){

  for(int i=0;i<9;i++)
   player.add(play);
  Game game = new Game(player);
  assertFalse(game.getNumberOfPlayer()>8);
 }

}
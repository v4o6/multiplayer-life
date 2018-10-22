package hackathon2018.multiplayerlife.entities;

import java.util.Arrays;

import org.junit.Test;

public class GameTest {

  private static final Player player1 = new Player();
  private static final Player player2 = new Player();
  private static final Player player3 = new Player();
  private static final Player player4 = new Player();
  static {
    player1.setName("one");
    player2.setName("two");
    player3.setName("three");
    player4.setName("four");
  }


  @Test
  public void buildStateTest() {
    final Game game = new Game();

    assert game.addPlayer(player1);
    assert game.addPlayer(player2);
    assert game.addPlayer(player3);
    assert game.addPlayer(player4);

    player1.setState(new LifeState(new boolean[][] {
        {true, false},
        {false, true}
    }));
    player2.setState(new LifeState(new boolean[][] {
        {false, true},
        {true, false}
    }));
    player3.setState(new LifeState(new boolean[][] {
        {false, false},
        {true, true}
    }));
    player4.setState(new LifeState(new boolean[][] {
        {true, true},
        {false, false}
    }));

    game.buildState();

    assert Arrays.deepEquals(game.getState().getData(), new boolean[][]{
        {true, false, false, true},
        {false, true, true, false},
        {false, false, true, true},
        {true, true, false, false}
    });
  }

}

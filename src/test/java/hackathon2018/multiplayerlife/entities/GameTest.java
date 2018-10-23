package hackathon2018.multiplayerlife.entities;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class GameTest {

  private static final Player player1 = new Player("one");
  private static final Player player2 = new Player("two");
  private static final Player player3 = new Player("three");
  private static final Player player4 = new Player("four");


  @Test
  public void buildStateTest1() {
    final Game game = new Game();

    assert game.addPlayer(player1);
    assert game.addPlayer(player2);
    assert game.addPlayer(player3);
    assert game.addPlayer(player4);

    player1.setState(new LifeState(new boolean[][] {
        {true}
    }));
    player2.setState(new LifeState(new boolean[][] {
        {false}
    }));
    player3.setState(new LifeState(new boolean[][] {
        {false}
    }));
    player4.setState(new LifeState(new boolean[][] {
        {true}
    }));

    game.buildState();

    assert game.getState().getSize() == player1.getState().getSize() * 2;
    assert Arrays.deepEquals(game.getState().getData(), new boolean[][]{
        {true, false},
        {false, true}
    });
  }

  @Test
  public void buildStateTest2() {
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

    assert game.getState().getSize() == player1.getState().getSize() * 2;
    assert Arrays.deepEquals(game.getState().getData(), new boolean[][]{
        {true, false, false, true},
        {false, true, true, false},
        {false, false, true, true},
        {true, true, false, false}
    });
  }

  @Test
  public void playerResultsTest1() {
    final Game game = new Game();

    assert game.addPlayer(player1);
    assert game.addPlayer(player2);
    assert game.addPlayer(player3);
    assert game.addPlayer(player4);

    final List<Player.Result> playerResults = game.getPlayerResults(new LifeState(new boolean[][] {
        {true, false, false, true},
        {false, false, true, false},
        {false, false, true, true},
        {true, true, false, true}
    }));

    final Player.Result result1 = playerResults.get(0);
    assert player1.getId() == result1.getId();
    assert player1.getName().equals(result1.getName());
    assert Arrays.deepEquals(result1.getFinishState().getData(), new boolean[][]{
        {true, false},
        {false, false}
    });
    assert  result1.getCount() == 1;

    final Player.Result result2 = playerResults.get(1);
    assert player2.getId() == result2.getId();
    assert player2.getName().equals(result2.getName());
    assert Arrays.deepEquals(result2.getFinishState().getData(), new boolean[][]{
        {false, true},
        {true, false}
    });
    assert  result2.getCount() == 2;

    final Player.Result result3 = playerResults.get(2);
    assert player3.getId() == result3.getId();
    assert player3.getName().equals(result3.getName());
    assert Arrays.deepEquals(result3.getFinishState().getData(), new boolean[][]{
        {false, false},
        {true, true}
    });
    assert  result3.getCount() == 2;

    final Player.Result result4 = playerResults.get(3);
    assert player4.getId() == result4.getId();
    assert player4.getName().equals(result4.getName());
    assert Arrays.deepEquals(result4.getFinishState().getData(), new boolean[][]{
        {true, true},
        {false, true}
    });
    assert  result4.getCount() == 3;
  }

}

package hackathon2018.multiplayerlife.entities;

import org.junit.Test;

public class ResultTest {

  private static final Player player1 = new Player("one");
  private static final Player player2 = new Player("two");
  private static final Player player3 = new Player("three");
  private static final Player player4 = new Player("four");


  @Test
  public void playerResultTest() {
    final Player.Result result1 = Player.Result.of(player1, new LifeState(new int[][] {
        {1, 1},
        {0, 1}
    }));
    assert result1.getCount() == 3;

    final Player.Result result2 = Player.Result.of(player1, new LifeState(new int[][] {
        {1, 0},
        {0, 1}
    }));
    assert result2.getCount() == 2;
  }

  @Test
  public void resultTest() {
    final Game game = new Game();

    assert game.addPlayer(player1);
    assert game.addPlayer(player2);
    assert game.addPlayer(player3);
    assert game.addPlayer(player4);

    final Result result = new Result(game, new LifeState(new int[][] {
        {1, 0, 0, 1},
        {0, 0, 1, 0},
        {0, 0, 1, 1},
        {1, 1, 0, 1}
    }));

    final Player.Result winner = result.getWinner();
    assert winner.getName().equals(player4.getName());
  }

}

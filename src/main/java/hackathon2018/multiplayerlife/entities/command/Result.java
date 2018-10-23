package hackathon2018.multiplayerlife.entities.command;

import java.util.List;

import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Player;

public class Result {

  private final LifeState state;
  private final List<Player.Result> results;

  public Result(final Game game, final LifeState state) {
    this.state = state;
    this.results = game.getPlayerResults(state);
  }

  public LifeState getState() {
    return state;
  }

  public List<Player.Result> getResults() {
    return results;
  }

  public Player.Result getWinner() {
    return null; // TODO dzmitry
  }

}

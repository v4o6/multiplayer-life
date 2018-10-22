package hackathon2018.multiplayerlife.service;

import org.springframework.stereotype.Service;

import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Player;

@Service
public class GameService {


  public Player registerPlayer(final String name) {
    // TODO
    // ... create player (no history/re-use; users create a new player for each game)
    // ... associate player with a game
    return null;
  }

  public Player getPlayer(final long playerId) {
    // TODO
    return null;
  }

  public Game getGame(final long gameId) {
    // TODO
    return null;
  }

  public Game getGameByPlayer(final long playerId) {
    // TODO
    return null;
  }

  public void setPlayerState(final long playerId, final LifeState state) {
    // TODO
  }


}

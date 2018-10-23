package hackathon2018.multiplayerlife.service;

import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Player;

@Service
public class GameService {

  private TreeMap<Long, Game> games =
      new TreeMap<Long, Game>(Comparator.reverseOrder());

  public Player registerPlayer(final String name) {
    // ... create player (no history/re-use; users create a new player for each game)
    Player newPlayer = new Player(name);
    // ... associate player with a game
    Game game;
    if (games.isEmpty()) {
      game = createNewGame();
    }
    else {
      game = games.firstEntry().getValue();
    }
    while (!game.addPlayer(newPlayer)) {
      game = createNewGame();
      }
    return newPlayer;
  }

  private SimpleEntry<Game, Player> getGamePlayerEntry(final long playerId) {
    for (Game game : games.values()) {
      for (Player player : game.getPlayers()) {
        if (Long.compare(playerId, player.getId()) == 0) {
          return new SimpleEntry<Game, Player>(game, player);
        }
      }
    }
    return null;
  }

  public Player getPlayer(final long playerId) {
    SimpleEntry<Game, Player> GamePlayerEntry = getGamePlayerEntry(playerId);
    if (GamePlayerEntry != null) {
      return GamePlayerEntry.getValue();
    }
    return null;
  }

  public Game getGameByPlayer(final long playerId) {
    SimpleEntry<Game, Player> GamePlayerEntry = getGamePlayerEntry(playerId);
    if (GamePlayerEntry != null) {
      return GamePlayerEntry.getKey();
    }
    return null;
  }

  public Game getGame(final long gameId) {
    for (Game game : games.values()) {
      if (Long.compare(game.getId(), gameId) == 0) {
        return game;
      }
    }
    return null;
  }

  public void setPlayerState(final long playerId, final LifeState state) {
    Player player = getPlayer(playerId);
    player.setState(state);

    // TODO kenny
    // if all players are ready, call game.
  }

  private Game createNewGame() {
    Game newGame = new Game();
    Long newGameId = newGame.getId();
    games.put(newGameId, newGame);
    return newGame;
  }

}

package hackathon2018.multiplayerlife.service;

import java.util.AbstractMap.SimpleEntry;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Player;
import hackathon2018.multiplayerlife.entities.Result;

@Service
public class GameService {

  private TreeMap<Long, Game> games = new TreeMap<Long, Game>();

  /*
   * Map between gameId and Result (game)
   */
  private TreeMap<Long, Result> gameResults = new TreeMap<Long, Result>();

  public Player registerPlayer(final String name) {
    // ... create player (no history/re-use; users create a new player for each game)
    Player newPlayer = new Player(name);
    // ... associate player with a game
    Game game;
    if (games.isEmpty()) {
      game = createNewGame();
    }
    else {
      game = games.lastEntry().getValue();
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

    // if all players are ready, call Game.buildState()
    Game game = getGameByPlayer(playerId);
    boolean ready = true;
    for (Player p : game.getPlayers()) {
      if (p.getState() == null) {
        ready = false;
      }
    }
    if (ready) {
      game.buildState();
    }
  }

  private Game createNewGame() {
    Game newGame = new Game();
    Long newGameId = newGame.getId();
    games.put(newGameId, newGame);
    return newGame;
  }

  public void writeGameResult(Long gameId, Result result) {
    gameResults.put(gameId, result);
  }

  public Result getGameResult(Long gameId) {
    return gameResults.get(gameId);
  }

  public Result getLastResult() {
    return gameResults.lastEntry().getValue();
  }

}

package hackathon2018.multiplayerlife.entities;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class Game {

  private static final AtomicLong idCounter = new AtomicLong(0);

  private final long id = idCounter.getAndIncrement();
  private final Player[] players = new Player[4];
  private final Object mutex = new Object();
  private LifeState state;

  public long getId() {
    return id;
  }

  public boolean addPlayer(final Player player) {
    synchronized (mutex) {
      // TODO
      return true;  // return true if player was successfully added (enough space in game)
    }
  }

  public Player[] getPlayers() {
    synchronized (mutex) {
      return Arrays.copyOf(players, players.length);
    }
  }

  // call when all players are ready
  public void buildState() {
    synchronized (mutex) {
      // TODO
      // construct joined LifeState from player states and save to "state" field.
    }
  }

  public LifeState getState() {
    synchronized (mutex) {
      return state;
    }
  }

}
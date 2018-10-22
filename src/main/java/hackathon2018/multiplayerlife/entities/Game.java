package hackathon2018.multiplayerlife.entities;

import java.util.concurrent.atomic.AtomicLong;

public class Game {

  private static final AtomicLong idCounter = new AtomicLong(0);

  private final long id = idCounter.getAndIncrement();
  private final Player[] players = new Player[4];
  private LifeState state;

  public long getId() {
    return id;
  }

  public Player[] getPlayers() {
    return players;
  }

  public LifeState getState() {
    return state;
  }

  public void setState(final LifeState state) {
    this.state = state;
  }

}

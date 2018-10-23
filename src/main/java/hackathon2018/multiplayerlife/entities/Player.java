package hackathon2018.multiplayerlife.entities;

import java.util.concurrent.atomic.AtomicLong;

public class Player {

  private static final AtomicLong idCounter = new AtomicLong(0);

  private final long id;
  private final String name;
  private LifeState state;

  public Player(final String name) {
    this.id = idCounter.getAndIncrement();
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public LifeState getState() {
    return state;
  }

  public void setState(final LifeState state) {
    this.state = state;
  }

}

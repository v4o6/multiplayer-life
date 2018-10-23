package hackathon2018.multiplayerlife.entities;

import java.util.concurrent.atomic.AtomicLong;

public class Player {

  private static final AtomicLong idCounter = new AtomicLong(0);

  private final long id;
  private final String name;
  private volatile LifeState state;

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


  public static class Status {
    private final long id;
    private final String name;
    private final boolean ready;

    private Status(final Player player) {
      id = player.getId();
      name = player.getName();
      ready = player.getState() != null;
    }

    public static Status of(final Player player) {
      return new Status(player);
    }

    public long getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public boolean isReady() {
      return ready;
    }
  }

}

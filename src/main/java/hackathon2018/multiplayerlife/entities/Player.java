package hackathon2018.multiplayerlife.entities;

import hackathon2018.functions.UtilsFunctions;

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

    static Status of(final Player player) {
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


  public static class Result {
    private final long id;
    private final String name;
    private final LifeState finishState;
    private final int count;

    private Result(final long id, final String name, final LifeState finishState) {
      this.id = id;
      this.name = name;
      this.finishState = finishState;
      this.count = countAlive(finishState);
    }

    public static Result of(final Player player, final LifeState finishState) {
      return new Result(player.getId(), player.getName(), finishState);
    }

    private static int countAlive(final LifeState state) {
      return UtilsFunctions.countBoolean(state.getData(), true);
    }

    public long getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public LifeState getFinishState() {
      return finishState;
    }

    public int getCount() {
      return count;
    }
  }

}

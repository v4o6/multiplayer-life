package hackathon2018.multiplayerlife.entities;

import hackathon2018.functions.UtilsFunctions;

import java.util.concurrent.atomic.AtomicLong;

public class Player {

  private static final AtomicLong idCounter = new AtomicLong(0);

  private final long id;
  private final String name;
  private Color color;
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

  public Color getColor() {
    return color;
  }

  public void setColor(final Color color) {
    this.color = color;
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
    private final Color color;
    private final boolean ready;

    private Status(final Player player) {
      id = player.id;
      name = player.name;
      color = player.color;
      ready = player.state != null;
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

    public Color getColor() {
      return color;
    }

    public boolean isReady() {
      return ready;
    }
  }


  public static class Result {
    private final long id;
    private final String name;
    private final Color color;
    private final LifeState finishState;
    private final int count;

    private Result(final Player player, final LifeState finishState) {
      this.id = player.id;
      this.name = player.name;
      this.color = player.color;
      this.finishState = finishState;
      this.count = countAlive(finishState, color);
    }

    public static Result of(final Player player, final LifeState finishState) {
      return new Result(player, finishState);

    }
    private static int countAlive(final LifeState state, final Color color) {
      return UtilsFunctions.countBoolean(state.getData(), 1 | color.getMask());
    }

    public long getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public Color getColor() {
      return color;
    }

    public LifeState getFinishState() {
      return finishState;
    }

    public int getCount() {
      return count;
    }
  }

}

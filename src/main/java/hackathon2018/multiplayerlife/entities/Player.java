package hackathon2018.multiplayerlife.entities;

import java.util.concurrent.atomic.AtomicLong;

public class Player {

  private static final AtomicLong idCounter = new AtomicLong(0);

  private final long id = idCounter.getAndIncrement();
  private String name;
  private LifeState state;

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public LifeState getState() {
    return state;
  }

  public void setState(final LifeState state) {
    this.state = state;
  }


  // Spring MVC Command Object
  public static class FormInput {
    private String name;

    public String getName() {
      return name;
    }

    public void setName(final String name) {
      this.name = name;
    }
  }

}

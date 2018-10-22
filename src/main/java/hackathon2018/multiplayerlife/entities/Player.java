package hackathon2018.multiplayerlife.entities;

import java.util.concurrent.atomic.AtomicLong;

import javax.validation.constraints.NotEmpty;

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


  // Spring MVC Command Object
  public static class FormInput {
    @NotEmpty(message = "Name is required.")
    private String name;

    public String getName() {
      return name;
    }

    public void setName(final String name) {
      this.name = name;
    }
  }

}

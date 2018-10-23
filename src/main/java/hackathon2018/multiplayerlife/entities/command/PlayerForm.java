package hackathon2018.multiplayerlife.entities.command;

import javax.validation.constraints.NotEmpty;

public class PlayerForm {

  @NotEmpty(message = "Name is required.")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

}

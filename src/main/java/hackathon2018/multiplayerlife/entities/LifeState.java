package hackathon2018.multiplayerlife.entities;

public class LifeState {

  private final boolean[][] data;

  public LifeState(final boolean[][] data) {
    this.data = data;
  }

  public int getSize() {
    return data.length;
  }

  public boolean[][] getData() {
    return data;
  }

}

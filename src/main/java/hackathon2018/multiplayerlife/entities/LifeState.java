package hackathon2018.multiplayerlife.entities;

public class LifeState {

  private final int[][] data;

  public LifeState(final int[][] data) {
    this.data = data;
  }

  public int getSize() {
    return data.length;
  }

  public int[][] getData() {
    return data;
  }

  public static LifeState forColor(final LifeState state, final Color color) {
    final int[][] data = state.data;
    final int[][] colored = new int[data.length][data.length];
    final int value = color.getMask() | 1;
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length; j++) {
        if (data[i][j] == value) {
          colored[i][j] = value;
        }
      }
    }
    return new LifeState(colored);
  }
}

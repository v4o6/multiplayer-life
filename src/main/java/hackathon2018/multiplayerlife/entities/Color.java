package hackathon2018.multiplayerlife.entities;

public enum Color {
  RED("#800000", 0),
  GREEN("#008000", 2),
  BLUE("#000080", 4),
  YELLOW("#808000", 6);

  private final String code;
  private final int mask;
  private final int value;

  Color(final String code, final int mask) {
    this.code = code;
    this.mask = mask;
    this.value = mask | 1;
  }

  public String getCode() {
    return code;
  }

  public int getMask() {
    return mask;
  }

  public int getValue() {
    return value;
  }
}

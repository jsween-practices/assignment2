package product;

class Brand {

  private final Type type;
  private final String name;

  Brand(String name) {
    this.name = name;
    if (name.equalsIgnoreCase("APPLE")) {
      type = Type.APPLE;
    } else {
      type = Type.OTHER;
    }
  }

  public enum Type {
    APPLE, OTHER
  }

  boolean isApple() {
    return type == Type.APPLE;
  }

  @Override
  public String toString() {
    return name;
  }
}

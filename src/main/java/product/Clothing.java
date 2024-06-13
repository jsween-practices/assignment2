package product;

public class Clothing extends Product {

  private final Size size;

  public Clothing(String name, int price, int stock, String size) {
    super(name, price, stock);
    this.size = Size.valueOf(size.toUpperCase());
  }

  @Override
  public int calculatePrice() {
    return switch (size) {
      case XL, L -> price.raise(10).multiply(stock);
      default -> super.calculatePrice();
    };
  }

  public enum Size {
    XL, L, M, S, XS
  }

  @Override
  public String toString() {
    return super.toString() + "사이즈: " + size.name() + "\n";
  }
}

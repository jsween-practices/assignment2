package product;

public class Clothing extends Product {

  private final Size size;

  public Clothing(String name, int price, int stock, Size size) {
    super(name, price, stock);
    this.size = size;
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
}

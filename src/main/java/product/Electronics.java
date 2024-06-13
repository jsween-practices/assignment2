package product;

public class Electronics extends Product {

  private final Brand brand;

  public Electronics(String name, int price, int stock, Brand brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  @Override
  public int calculatePrice() {
    if (brand == Brand.APPLE) {
      return price.raise(20).multiply(stock);
    }
    return super.calculatePrice();
  }

  public enum Brand {
    APPLE, OTHER
  }

}

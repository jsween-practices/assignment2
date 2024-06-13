public class Electronics extends Product{
  private final Brand brand;

  public Electronics(String name, int price, int stock, Brand brand) {
    super(name, price, stock);
    this.brand = brand;
  }

  public enum Brand {
    APPLE, SAMSUNG, LG
  }

}

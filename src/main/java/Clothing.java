public class Clothing extends Product {
  private Size size;

  public Clothing(String name, int price, int stock, Size size) {
    super(name, price, stock);
    this.size = size;
  }

  public enum Size{
    XL, L, M, S, XS
  }
}

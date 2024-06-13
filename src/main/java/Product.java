public class Product {
  private String name;
  protected Price price;
  protected int stock;

  public Product(String name, int price, int stock) {
    this.name = name;
    this.price = new Price(price);
    this.stock = stock;
  }

  public int calculatePrice() {
    return price.multiply(stock);
  }
}

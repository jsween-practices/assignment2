package product;

public class Electronics extends Product {

  private final Brand brand;

  public Electronics(String name, int price, int stock, String brandName) {
    super(name, price, stock);
    this.brand = new Brand(brandName);
  }

  @Override
  public int calculatePrice() {
    if (brand.isApple()) {
      return price.raise(20).multiply(stock);
    }
    return super.calculatePrice();
  }


  @Override
  public String toString() {
    return super.toString() + "브랜드: "+ brand + "\n";
  }
}

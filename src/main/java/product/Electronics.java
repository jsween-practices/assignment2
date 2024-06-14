package product;

public class Electronics extends Product {

  private final Brand brand;

  public Electronics(String name, int price, int stock, String brandName) {
    super(name, price, stock);
    this.brand = new Brand(brandName);
  }

  @Override
  public Price calculatePrice() {
    if (brand.isApple()) {
      return super.calculatePrice().raise(20);
    }
    return super.calculatePrice();
  }


  @Override
  public String toString() {
    return super.toString() + "브랜드: "+ brand + "\n";
  }
}

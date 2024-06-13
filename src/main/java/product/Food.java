package product;

import java.time.LocalDate;

public class Food extends Product {

  private ExpirationDate expirationDate;

  public Food(String name, int price, int stock, LocalDate expirationDate) {
    super(name, price, stock);
    this.expirationDate = new ExpirationDate(expirationDate);
  }

  @Override
  public int calculatePrice() {
    if (expirationDate.checkExpiration()) {
      return price.raise(-20).multiply(stock);
    }
    return super.calculatePrice();
  }
}

package product;

import java.time.LocalDate;

public class Food extends Product {

  private ExpirationDate expirationDate;

  public Food(String name, int price, int stock, LocalDate expirationDate) {
    super(name, price, stock);
    this.expirationDate = new ExpirationDate(expirationDate);
  }

  @Override
  public Price calculatePrice() {
    if (expirationDate.checkExpiration()) {
      return super.calculatePrice().raise(-20);
    }
    return super.calculatePrice();
  }

  @Override
  public String toString() {
    return super.toString()+"유통기한: "+expirationDate+"\n";
  }
}

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Food extends Product {

  private LocalDate expirationTime;

  public Food(String name, int price, int stock, LocalDate expirationTime) {
    super(name, price, stock);
    this.expirationTime = expirationTime;
  }

  @Override
  public int calculatePrice() {
    Period between = Period.between(LocalDate.now(), expirationTime);
    if (between.get(ChronoUnit.DAYS) <= 7) {
      return price.raise(-20).multiply(stock);
    }
    return super.calculatePrice();
  }
}

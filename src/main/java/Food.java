import java.time.LocalDate;

public class Food extends Product{
  private LocalDate expirationTime;

  public Food(String name, int price, int stock, LocalDate expirationTime) {
    super(name, price, stock);
    this.expirationTime = expirationTime;
  }
}

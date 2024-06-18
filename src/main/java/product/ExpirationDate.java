package product;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

class ExpirationDate {
  static private final int EXPIRATION_DURATION = 7;
  private final LocalDate date;

  public ExpirationDate(LocalDate date) {
    this.date = date;
  }

  public boolean checkExpiration() {
    Period between = Period.between(LocalDate.now(), date);
    return between.get(ChronoUnit.DAYS) <= EXPIRATION_DURATION;
  }

  @Override
  public String toString() {
    return ""+date;
  }
}

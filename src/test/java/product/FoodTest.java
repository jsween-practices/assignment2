package product;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Period;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodTest {

  @Test
  @DisplayName("유통기한 7일 초과")
  void calculatePrice() {
    LocalDate now = LocalDate.now();
    Food out = new Food("out", 100, 2, now.plus(Period.ofDays(8)));
    assertEquals(out.calculatePrice(), 200);
  }
  @Test
  @DisplayName("유통기한 7일 이하")
  void calculatePricein() {
    LocalDate now = LocalDate.now();
    Food out = new Food("out", 100, 2, now.plus(Period.ofDays(6)));
    assertEquals(out.calculatePrice(), 160);
  }
}
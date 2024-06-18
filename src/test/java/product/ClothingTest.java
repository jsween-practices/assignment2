package product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClothingTest {

  @Test
  @DisplayName("사이즈가 M이하면 가격이 그대로")
  void calculatePrice() {
    Clothing m = new Clothing("M", 100, 2, "M");
    Clothing s = new Clothing("S", 100, 2, "S");
    Clothing xs = new Clothing("XS", 100, 2, "XS");
    assertEquals(m.calculatePrice(), 100);
    assertEquals(s.calculatePrice(), 100);
    assertEquals(xs.calculatePrice(), 100);
  }

  @Test
  @DisplayName("사이즈가 L이상이면 가격이 10% 인상")
  void calculatePriceRaise() {
    Clothing l = new Clothing("L", 100, 2, "L");
    Clothing xl = new Clothing("XL", 100, 2, "XL");
    assertEquals(l.calculatePrice(), 110);
    assertEquals(xl.calculatePrice(), 110);
  }
}
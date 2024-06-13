package product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import product.Clothing;
import product.Clothing.Size;

class ClothingTest {

  @Test
  @DisplayName("사이즈가 M이하면 가격이 그대로")
  void calculatePrice() {
    Clothing m = new Clothing("M", 100, 2, Size.M);
    Clothing s = new Clothing("S", 100, 2, Size.S);
    Clothing xs = new Clothing("XS", 100, 2, Size.XS);
    assertEquals(m.calculatePrice(), 200);
    assertEquals(s.calculatePrice(), 200);
    assertEquals(xs.calculatePrice(), 200);
  }

  @Test
  @DisplayName("사이즈가 L이상이면 가격이 10% 인상")
  void calculatePriceRaise() {
    Clothing l = new Clothing("L", 100, 2, Size.L);
    Clothing xl = new Clothing("XL", 100, 2, Size.XL);
    assertEquals(l.calculatePrice(), 220);
    assertEquals(xl.calculatePrice(), 220);
  }
}
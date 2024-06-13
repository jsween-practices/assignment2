package product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import product.Electronics.Brand;

class ElectronicsTest {

  @Test
  @DisplayName("APPLE이면 가격에 20% 추가")
  void calculatePrice() {
    Electronics apple = new Electronics("apple", 100, 2, Brand.APPLE);
    assertEquals(apple.calculatePrice(), 240);
  }

  @Test
  @DisplayName("APPLE이 아니면 그대로")
  void calculatePriceOther() {
    Electronics apple = new Electronics("other", 100, 2, Brand.OTHER);
    assertEquals(apple.calculatePrice(), 200);
  }
}
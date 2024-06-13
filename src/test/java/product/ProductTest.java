package product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductTest {

  @Test
  @DisplayName("가격 계산은 재고 * 가격")
  void calculatePrice() {
    Product sample = new Product("샘플", 100, 3);
    Product sample2 = new Product("샘플2", 100, 5);
    Product sample3 = new Product("샘플3", 500, 5);
    assertEquals(sample.calculatePrice(), 300);
    assertEquals(sample2.calculatePrice(), 500);
    assertEquals(sample3.calculatePrice(), 2500);
  }
}
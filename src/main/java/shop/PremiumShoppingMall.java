package shop;

import product.Product;

public class PremiumShoppingMall extends ShoppingMall{
  private static final int MIN_ORDER_STOCK = 10;

  public PremiumShoppingMall(int size) {
    super(size);
  }

  @Override
  public boolean checkOrderAvailability(Product product) {
    return product.isManyThan(MIN_ORDER_STOCK);
  }
}

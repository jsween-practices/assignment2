package shop;

import product.Product;

public abstract class ShoppingMall {
  private final Products products;

  public ShoppingMall(int size) {
    this.products = new Products(size);
  }

  public void postProduct(Product product) {
    products.add(product);
  }

  public void deleteProduct(String name) {
    products.remove(new Product(name));
  }

  public void printProducts() {
    System.out.println(this+"\n\n\n\n\n");
  }

  public abstract boolean checkOrderAvailability(Product product);

  @Override
  public String toString() {
    if (products.isEmpty())
      return "쇼핑몰이 비었습니다.";
    return "상품 목록" + products;
  }
}

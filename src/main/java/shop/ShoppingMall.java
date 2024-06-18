package shop;

import product.Product;

public abstract class ShoppingMall {
  private final Products products;

  public ShoppingMall(int size) {
    this.products = new Products(size);
  }

  public void addProduct(Product product) {
    products.add(product);
  }
  public void removeProduct(String name) {
    removeProduct(new Product(name));
  }

  public void removeProduct(Product product) {
    products.remove(product);
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

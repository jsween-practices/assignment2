package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import product.Product;

public class ShoppingMall {

  private final List<Product> products = new ArrayList<>();

  public void postProduct(Product product) {
    products.add(product);
  }

  public void deleteProduct(String name) {
    products.remove(new Product(name));
  }

  public void printProducts() {
    System.out.println(this+"\n\n\n\n\n");
  }

  @Override
  public String toString() {
    if (products.isEmpty())
      return "쇼핑몰이 비었습니다.";
    return "상품 목록\n\n" + products.stream().map(Product::toString).collect(Collectors.joining("\n"));

  }
}

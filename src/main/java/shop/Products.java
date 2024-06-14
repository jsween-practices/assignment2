package shop;

import product.Product;

class Products {

  private Product[] products;
  private int size;
  private int next;
  static private final String LINE = "=========================\n";

  Products(int size) {
    this.products = new Product[size];
    this.size = size;
    this.next = 0;
  }


  void add(Product product) {
    if (next >= size) {
      resize();
    }
    products[next] = product;
    next++;
  }

  private void resize() {
    int previousSize = size;
    size = size == 0 ? 1 : size * 2;
    Product[] newProducts = new Product[size];
    if (previousSize >= 0) {
      System.arraycopy(products, 0, newProducts, 0, previousSize);
    }
    products = newProducts;
  }

  boolean isEmpty() {
    return next == 0;
  }


  void remove(Product product) {
    if (indexOf(product) == -1) {
      return;
    }
    for (int i = indexOf(product); i < next - 1; i++) {
      products[i] = products[i + 1];
    }
    next--;
    products[next] = null;
  }

  private int indexOf(Product product) {
    for (int i = 0; i < next; i++) {
      if (products[i].equals(product)) {
        return i;
      }
    }
    return -1;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(LINE);
    for (int i = 0; i < next; i++) {
      builder.append(products[i]);
      builder.append(LINE);
    }
    return builder.toString();
  }
}

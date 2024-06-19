package product;

import java.util.Objects;

public class Product {

  private String name;
  private Price price;
  private Integer stock;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public Product(String name, int price, int stock) {
    this.name = name;
    this.price = new Price(price);
    this.stock = stock;
  }

  public Product(String name) {
    this.name = name;
    price = new Price(0);
    stock = 0;
  }

  public boolean isManyThan(int size) {
    return stock >= size;
  }

  public Price calculatePrice() {
    return price;
  }

  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null) {
      return false;
    }
    if (o instanceof Product product) {
      return Objects.equals(name, product.name);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return "이름: '" + name + "'\n" + "가격: " + price + '\n' + "재고: " + stock
        + '\n' + "할인 적용 가격: "+calculatePrice()+ '\n';
  }

}

package product;

import java.util.Objects;

class Price {
  private final int price;

  public Price(int price) {
    this.price = price;
  }

  public Price raise(int percent) {
    return new Price(price * (100+percent) / 100);
  }

  public Price multiply(int stock) {
    return new Price(price * stock);
  }

  @Override
  public String toString() {
    return ""+price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Price price1) {
      return price == price1.price;
    }
    if (o instanceof Integer price2) {
      return price2.equals(price);
    }
    return false;
  }

  public boolean equals(int i) {
    return price == i;
  }

  @Override
  public int hashCode() {
    return Objects.hash(price);
  }
}

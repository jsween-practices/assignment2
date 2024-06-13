package product;

class Price {
  private int price;

  public Price(int price) {
    this.price = price;
  }

  public Price raise(int percent) {
    return new Price(price * (100+percent) / 100);
  }

  public int multiply(int stock) {
    return price * stock;
  }

  @Override
  public String toString() {
    return ""+price;
  }
}

1. 상품(product.Product)이라는 부모 클래스를 생성하고, 자식 클래스로 의류(product.Clothing), 전자제품(product.Electronics), 식품(product.Food)을 생성할 것 (15점)
    - product.Product 클래스는 상품명, 가격, 재고량 필드를 가지며 적절한 생성자와 getter, setter를 포함할 것
    - 각 자식 클래스는 Product를 상속받고 독자적인 필드를 추가할 것 (product.Clothing-사이즈, product.Electronics-브랜드, product.Food-유통기한)
2. 각 자식 클래스의 생성자에서는 부모 생성자를 호출하여 상품명, 가격, 재고량을 설정하고, 자식 클래스의 독자적인 필드도 설정할 수 있도록 할 것 (15점)
3. product.Product 클래스에 가격을 계산하는 calculatePrice() 메소드를 생성하고, 자식 클래스에서 이를 오버라이딩 할 것 (15점)
    - Product의 calculatePrice()는 가격을 그대로 리턴함
    - Clothing의 calculatePrice()는 사이즈가 "L" 이상이면 가격에 10%를 추가함
    - Electronics의 calculatePrice()는 브랜드가 "Apple"이면 가격에 20%를 추가함
    - Food의 calculatePrice()는 유통기한이 7일 이하로 남았다면 가격에서 20%를 할인함
4. 쇼핑몰 클래스(ShoppingMall)를 생성하고 여러 상품을 담을 수 있는 리스트를 필드로 가질 것 (15점)
    - 제품 추가, 제품 삭제, 제품 목록 출력 기능을 가진 메소드들을 오버로딩으로 생성할 것
5. ShoppingMall에 주문 가능 여부를 확인하는 추상 메소드 checkOrderAvailability()를 생성할 것 (15점)
    - 이를 상속받은 Premium 쇼핑몰 클래스를 생성하고 checkOrderAvailability() 를 오버라이딩 할 것
    - Premium 쇼핑몰은 재고량이 10개 이상일 때에만 주문 가능하도록 할 것
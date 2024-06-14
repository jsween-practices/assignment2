import java.time.LocalDate;
import product.Clothing;
import product.Electronics;
import product.Food;
import product.Product;
import shop.ShoppingMall;

public class Main {

  public static void main(String[] args) {
    ShoppingMall shoppingMall = new ShoppingMall(2);
    System.out.println("상품 없을 때");
    shoppingMall.printProducts(); // 상품없을 때 출력

    Product pencil = new Product("연필", 500, 20);
    shoppingMall.postProduct(pencil);
    System.out.println("일반 상품 CRD 테스트");
    shoppingMall.printProducts(); //일반 상품 총 가격 price * stock
    shoppingMall.deleteProduct("연필"); // 일반 상품 삭제
    shoppingMall.printProducts(); // 상품없을 때 출력


    Electronics iphone = new Electronics("아이폰 15 Pro Max", 2000000, 10, "Apple");
    shoppingMall.postProduct(iphone);
    System.out.println("Apple 전자기기 CRD 테스트");
    shoppingMall.printProducts(); //Apple 전자기기 총 가격 price * stock * 120 / 100
    shoppingMall.deleteProduct("아이폰 15 Pro Max"); // 일반 상품 삭제
    shoppingMall.printProducts(); // 상품없을 때 출력


    Electronics galaxyS21 = new Electronics("갤럭시 S21", 1500000, 20, "Samsung");
    shoppingMall.postProduct(galaxyS21);
    System.out.println("일반 전자기기 CRD 테스트");
    shoppingMall.printProducts(); //일반 전자기기 총 가격 price * stock
    shoppingMall.deleteProduct("갤럭시 S21"); // 일반 전자기기 삭제
    shoppingMall.printProducts(); // 상품없을 때 출력


    Clothing pants = new Clothing("바지", 60000, 40, "XL");
    shoppingMall.postProduct(pants);
    Clothing tshirts = new Clothing("티셔츠", 30000, 50, "L");
    shoppingMall.postProduct(tshirts);
    System.out.println("L이상 의류 CRD 테스트");
    shoppingMall.printProducts(); //L 이상 총 가격 price * stock * 110 / 100
    shoppingMall.deleteProduct("바지"); // 바지 제거
    shoppingMall.printProducts(); // 티셔츠만 출력
    shoppingMall.deleteProduct("티셔츠"); // 티셔츠 제거
    shoppingMall.printProducts(); // 상품없을 때 출력

    Clothing socks = new Clothing("양말", 4000, 100, "S");
    shoppingMall.postProduct(socks);
    System.out.println("M이하 의류 CRD 테스트");
    shoppingMall.printProducts(); // M이하 총 가격 price * stock
    shoppingMall.deleteProduct("양말"); // 양말 제거
    shoppingMall.printProducts(); // 상품없을 때 출력

    Food ddeok = new Food("떡볶이", 8000, 200, LocalDate.of(2024, 6, 20));
    shoppingMall.postProduct(ddeok);
    System.out.println("유통기한 7일 이하 CRD 테스트");
    shoppingMall.printProducts(); // 유통기한 7일 이하 총 가격 price * stock * 80 / 100
    shoppingMall.deleteProduct("떡볶이"); // 떡볶이 제거
    shoppingMall.printProducts(); // 상품없을 때 출력

    Food bigMag = new Food("빅맥", 4800, 100, LocalDate.of(2024, 6, 27));
    shoppingMall.postProduct(bigMag);
    System.out.println("유통기한 7일 초과 CRD 테스트");
    shoppingMall.printProducts(); // 유통기한 7일 초과 총 가격 price * stock
    shoppingMall.deleteProduct("빅맥"); // 빅맥 제거
    shoppingMall.printProducts(); // 상품없을 때 출력

  }
}

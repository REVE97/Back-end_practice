package AfterLecture_0416;

import java.util.Date;

public class FishBread {
    
    // 기본 생성자 데이터는 필드에 선언
    String taste = "팥";
    String shape = "붕어";
    int price = 700;
    Date makeTime = new Date(); // 현재 시간 클래스
    
    // 오버로딩
    FishBread() {}

    FishBread(String taste, String shape, int price) {
        this.shape = shape;
        this.price = price;
        this.taste = taste;
    }

    // 메소드
    void printFishBread() {
        System.out.println("붕어빵의 맛은 : " + this.taste);
        System.out.println("붕어빵의 모양은 : " + this.shape);
        System.out.println("붕어빵의 가격은 : " + this.price);
        System.out.println("붕어빵의 시간은 : " + this.makeTime);
    }

}

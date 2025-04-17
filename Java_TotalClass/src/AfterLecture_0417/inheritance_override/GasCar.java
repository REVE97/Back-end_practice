package AfterLecture_0417.inheritance_override;

public class GasCar extends Car {
    // 오버라이딩
    @Override // 오버라이딩 되어 있는지 확인
    public void move() {
        System.out.println("휘발유 차가 이동합니다.");
    }
    @Override
    public void openDoor() {
        System.out.println("휘발유 차가 문을 엽니다");
    }
    @Override
    public void fillUp() {
        System.out.println("기름을 주유합니다");
    }
}

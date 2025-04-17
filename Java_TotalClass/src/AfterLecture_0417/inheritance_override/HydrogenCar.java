package AfterLecture_0417.inheritance_override;

public class HydrogenCar extends Car {
    @Override // 오버라이딩 되어 있는지 확인
    public void move() {
        System.out.println("수소차가 이동합니다.");
    }
    @Override
    public void openDoor() {
        System.out.println("수소차 문을 엽니다");
    }

    public void fillUp() {
        System.out.println("수소를 충전 합니다");
    }
}

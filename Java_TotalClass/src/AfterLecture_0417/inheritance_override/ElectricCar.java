package AfterLecture_0417.inheritance_override;

public class ElectricCar  extends Car {
    @Override
    public void move() {
        System.out.println("전기차가 이동합니다");
    }
    @Override
    public void openDoor() {
        System.out.println("전기차가 문을 엽니다");
    }

    public void fillUp() {
        System.out.println("전기차에 충전합니다");
    }

}

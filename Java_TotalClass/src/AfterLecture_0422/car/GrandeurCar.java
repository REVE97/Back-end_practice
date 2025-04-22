package AfterLecture_0422.car;

import java.util.Scanner;

public class GrandeurCar implements Car {
    int efficiency = 1;
    int fuel;

    @Override
    public void openDoor() {
        System.out.println("그랜져 문을 엽니다");
    }

    @Override
    public void fillFuel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주유할 기름의 양을 입력 하세요 : ");
        this.fuel = sc.nextInt();
    }

    @Override
    public void drive() {
        fillFuel();
        openDoor();

        System.out.println("그랜져가 주행을 시작합니다");
        int distance = efficiency * fuel;
        System.out.println("그랜져는 총 " + distance + " km 만큼 달렸습니다");
        System.out.println("그랜져 주행 종료");
    }
}

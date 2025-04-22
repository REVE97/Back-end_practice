package AfterLecture_0422.car;

import java.util.Scanner;

public class Driver {
    static final int K5 = 1;
    static final int GRANDEUR = 2;

    Car car = null;
    Scanner sc = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }

    public void selectCar() {
        System.out.print("운전하고 싶은 차를 선택 하세요. (1. K5 / 2. 그랜져) : ");
        int choice = sc.nextInt();

        if (choice == K5) {
            setCar(new K5Car());
        } else if (choice == GRANDEUR) {
            setCar(new GrandeurCar());
        }

        drive();
    }

    public void drive() {
        this.car.drive();
    }
}

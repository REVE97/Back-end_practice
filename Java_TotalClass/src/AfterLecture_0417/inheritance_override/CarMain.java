package AfterLecture_0417.inheritance_override;

public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();

        gasCar.fillUp();
        gasCar.move();
        gasCar.openDoor();

        electricCar.fillUp();
        electricCar.move();
        electricCar.openDoor();
    }
}

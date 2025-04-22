package AfterLecture_0422.abstractt;

public class Duck extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("오리는 꽥꽥");
    }

    public void fly() {
        System.out.println("오리 날다!");
    }
}

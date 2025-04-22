package AfterLecture_0422.interfacee;

public class American implements Human{
    @Override
    public void speak() {
        System.out.println("Hello");
    }

    @Override
    public void eat() {
        System.out.println("hamburger");
    }

    @Override
    public void hello() {
        System.out.println("current year? " + Human.nowYear);
    }

}


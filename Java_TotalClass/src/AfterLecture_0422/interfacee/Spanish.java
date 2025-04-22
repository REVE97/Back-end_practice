package AfterLecture_0422.interfacee;

public class Spanish implements Human{
    @Override
    public void speak() {
        System.out.println("스페인어 몰라여");
    }

    @Override
    public void eat() {
        System.out.println("paella");
    }

    @Override
    public void hello() {
        System.out.println("?????????? " + Human.nowYear);
    }

}

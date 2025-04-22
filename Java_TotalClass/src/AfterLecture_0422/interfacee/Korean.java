package AfterLecture_0422.interfacee;

public class Korean implements Human{
    @Override
    public void speak() {
        System.out.println("안녕하세요");
    }

    @Override
    public void eat() {
        System.out.println("한국인은 제육");
    }

    @Override
    public void hello() {
        System.out.println("지금이 몇 년도죠? " + Human.nowYear);
    }

}

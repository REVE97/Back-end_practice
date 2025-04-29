package AfterLecture_0429.exception.ex1;

public class Ex1Main {
    static class Parent {};
    static class Child extends Parent {
        void ChildMethod() {
            System.out.println("Child.ChildMethod");
        }
    };
    public static void main(String[] args) {
        try {
            Parent parent = new Parent();
            Child poly = (Child) parent;
            poly.ChildMethod();
        } catch (Exception e) {
            System.out.println("예외 처리 완료");
            e.printStackTrace();
        }
    }
}
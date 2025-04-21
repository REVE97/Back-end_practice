package AfterLecture_0421.poly2.casting;

public class CastingMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        Parent parent = new Child();

        parent.parentMethod();
//        parent.childMethod(); // 실행 불가능

        Child poly = (Child) parent;
        poly.childMethod(); // 실행 가능
        poly.parentMethod();
    }
}

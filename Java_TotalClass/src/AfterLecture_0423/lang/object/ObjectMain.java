package AfterLecture_0423.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        String str = child.toString(); // 주소값
        System.out.println(str);

    }
}

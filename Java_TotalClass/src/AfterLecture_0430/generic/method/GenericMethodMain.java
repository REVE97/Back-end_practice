package AfterLecture_0430.generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer value = GenericMethod.<Integer>genericMethod(10);
        System.out.println(value);
    }
}

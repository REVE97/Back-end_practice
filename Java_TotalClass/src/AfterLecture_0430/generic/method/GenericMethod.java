package AfterLecture_0430.generic.method;

public class GenericMethod {
    public static <T> T genericMethod(T t) {
        System.out.println("GenericMethod" + t);
        return t;
    }
}

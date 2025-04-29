package AfterLecture_0429.exception.uncheck;

// Exception 을 상속 받으면 Check 예외가 된다
public class MyUnCheckException extends RuntimeException {
    public MyUnCheckException(String message) {
        super(message);
    }
}

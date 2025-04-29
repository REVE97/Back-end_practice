package AfterLecture_0429.exception.uncheck;

public class Client {
    public void callException() {
        throw new MyUnCheckException("Client.call 에서 에러발생");
    }
}
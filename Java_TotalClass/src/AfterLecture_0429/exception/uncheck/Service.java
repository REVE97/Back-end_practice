package AfterLecture_0429.exception.uncheck;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        
        try {
            client.callException();
        } catch (MyUnCheckException e) {
            e.getMessage();
            e.printStackTrace(System.out);
        }

        System.out.println("예외처리");
    }
}

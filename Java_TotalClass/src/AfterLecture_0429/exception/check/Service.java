package AfterLecture_0429.exception.check;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        
        try {
            client.callException();
        } catch (MyCheckException e) {
            e.printStackTrace();
        }

        System.out.println("예외처리");
    }
}

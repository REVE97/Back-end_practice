package AfterLecture_0417.access;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1000);

        account.deposit(10000); //용돈
        account.withdraw(5000); //학식

        account.total = 50000000;

        System.out.println("남은 금액: " + account.total);
    }
}

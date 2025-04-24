package AfterLecture_0424.nested.example2;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 500);
        Account account2 = new Account("Kevin", 1500);

        Account.StaticAccountStatus.showStatus();
    }
}

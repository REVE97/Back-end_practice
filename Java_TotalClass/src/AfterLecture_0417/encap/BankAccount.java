package AfterLecture_0417.encap;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 1000000;
    }

    // getter 생성 -> private 처리된 데이터를 확인하기 위해 생성됨
    public int getBalance() {
        return balance;
    }
}

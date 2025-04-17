package AfterLecture_0417.access;

public class AccountRefactor {
    public String bank; //은행명
    String grade; //회원등급 (default 가 생략되어 있음)
    private String name; //계좌 소유주
    private int total; //은행잔고

    void deposit(int amount) {
        this.total += amount;
    }

    void withdraw(int amount) {
        this.total -= amount;
    }

    public AccountRefactor(String bank, int total, String name, String grade) {
        this.bank = bank;
        this.total = total;
        this.name = name;
        this.grade = grade;
    }
}

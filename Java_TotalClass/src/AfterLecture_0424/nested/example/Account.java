package AfterLecture_0424.nested.example;

import java.time.LocalDateTime;

public class Account {
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        Transaction transaction = new Transaction("입금", amount);
        transaction.print(balance);
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }

        balance -= amount;
        Transaction transaction = new Transaction("출금", amount);
        transaction.print(balance);
    }

    // 비정적 내부 클래스
    private class Transaction { //private로 선언하면 외부에서 접근이 불가능하여 더 좋은 캡슐화 가능
        private String type;
        private int amount;
        private LocalDateTime timestamp;

        public Transaction(String type, int amount) {
            this.type = type;
            this.amount = amount;
            this.timestamp = LocalDateTime.now();
        }

        public void print(int balance) {
            System.out.println("[" + timestamp + "] " + type + " - 금액: " + amount + "원, 잔액: " + balance + "원");
        }
    }
}


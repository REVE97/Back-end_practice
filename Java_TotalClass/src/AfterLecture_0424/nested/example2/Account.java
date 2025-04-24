package AfterLecture_0424.nested.example2;

public class Account {
    static private int count = 0;
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;

        count++;
        StaticAccountStatus.lastOpener = owner;
    }

    public static class StaticAccountStatus {
        static public String lastOpener;

        public static void showStatus() {
            System.out.println("현재 해당 상품은 총 " + count + "만큼 개설 되었습니다");
            System.out.println("해당 상품을 마지막으로 개설한 사람은 " + lastOpener + "입니다");

        }
    }
}

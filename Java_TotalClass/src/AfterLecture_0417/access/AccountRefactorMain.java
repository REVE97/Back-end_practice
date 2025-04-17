package AfterLecture_0417.access;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("국민은행", 1000,"곽효재", "silver");

        System.out.println("public 접근제어자 확인");
        System.out.println("은행명은 ? " + account.bank);

        System.out.println("default 접근제어자 확인");
        System.out.println("회원등급은 ? " + account.grade);

        System.out.println("private 접근제어자 확인");
//        System.out.println("잔고는 ? " + account.total); // 접근제어자 오류 발생
//        System.out.println("이름은 ? " + account.name); // 접근제어자 오류 발생

    }
}

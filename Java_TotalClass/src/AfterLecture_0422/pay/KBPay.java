package AfterLecture_0422.pay;

public class KBPay implements Pay {
    @Override
    public void pay(int amount) {
        System.out.println("KB Pay 시스템과 연결 합니다");
        System.out.println(amount + "원 결제를 시도합니다");
        System.out.println("결제 성공");
    }
}

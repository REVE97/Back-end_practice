package AfterLecture_0422.pay;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner sc = new Scanner(System.in);

        int option;
        int amount;

        System.out.print("결제 옵션을 입력하세요 (1.KBPay / 2.KaKaoPay / 3.NaverPay) : ");
        option = sc.nextInt();

        System.out.print("결제 금액을 입력하세요 : ");
        amount = sc.nextInt();

        if (option == 1) {
            paySystem.setPay(new KBPay());
        }  else if (option == 2) {
            paySystem.setPay(new KaKaoPay());
        } else if (option == 3) {
            paySystem.setPay(new NaverPay());
        }

        paySystem.payment(amount);

    }
}
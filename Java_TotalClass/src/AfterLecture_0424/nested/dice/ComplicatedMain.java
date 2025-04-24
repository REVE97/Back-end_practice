package AfterLecture_0424.nested.dice;

import java.util.Random;

public class ComplicatedMain {
    public static void complicateProgram(Dice dice) {
        System.out.println("프로그램 시작");
        
        // Dice 인터페이스의 구현체는
        // run 메서드가 반드시 구현 되어야 함
        dice.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Dice diceProgram = new Dice() {
            public void run() {
                int rand = new Random().nextInt(6) + 1;
                System.out.println("주사위의 값은 " + rand);
            }
        };

        complicateProgram(diceProgram);
    }
}

package AfterLecture_0417.access;

public class Speaker {
    private boolean power;
    private int volume;

    void powerOn() {
        if(power == true) {
            System.out.println("이미 전원이 켜져 있습니다.");
        } else {
            power = true;
            System.out.println("전원을 켭니다.");
        }
    }

    void powerOff() {
        if(power == true) {
            power = false;
            System.out.println("전원을 끕니다.");
        } else {
            System.out.println("전원을 먼저 켜주세요.");
        }
    }

    void volumeUp() {
        if(power == false) {
           System.out.println("전원을 먼저 켜주세요");
        } else {
            volume++;
            System.out.println("현재 Volume : " + volume);
        }
        if(volume >= 100) {
            System.out.println("더 이상 볼륨을 올릴 수 없습니다");
        }
    }

    void volumeDown() {
        if(volume <= 0) {
            System.out.println("더 이상 볼륨을 내릴수 없습니다");
        } else {
            volume--;
            System.out.println("현재 Volume : " + volume);
        }
        if(power == false) {
            System.out.println("전원을 먼저 켜주세요");
        }
    }
}

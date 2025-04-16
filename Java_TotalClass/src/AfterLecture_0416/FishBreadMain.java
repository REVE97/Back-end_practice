package AfterLecture_0416;

public class FishBreadMain {
    public static void main(String[] args) {
        FishBread fish1 = new FishBread();
        FishBread fish2 = new FishBread("슈크림", "잉어",500);

        // fish1
//        System.out.println("붕어빵의 맛은 : " + fish1.taste);
//        System.out.println("붕어빵의 모양은 : " + fish1.shape);
//        System.out.println("붕어빵의 가격은 : " + fish1.price);
//        System.out.println("붕어빵의 시간은 : " + fish1.makeTime);
        fish1.printFishBread();

        // fish2
//        System.out.println("붕어빵2의 맛은 : " + fish2.taste);
//        System.out.println("붕어빵2의 모양은 : " + fish2.shape);
//        System.out.println("붕어빵2의 가격은 : " + fish2.price);
        fish2.printFishBread();
    }
}

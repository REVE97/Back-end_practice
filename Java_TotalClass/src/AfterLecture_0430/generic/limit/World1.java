package AfterLecture_0430.generic.limit;

public class World1 {
    public static void main(String[] args) {
        IntegerWorld integerWorld = new IntegerWorld();
        integerWorld.setNumber(10);
        System.out.println(integerWorld.getNumber());
        
        IntegerWorld integerWorld2 = new IntegerWorld();
//        integerWorld2.transDouble(10.3); // 오류 발생
        System.out.println(integerWorld2.getNumber());
    }
}

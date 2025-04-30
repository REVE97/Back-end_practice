package AfterLecture_0430.generic.limit;

public class World2 {
    public static void main(String[] args) {
        GenericWorld<Integer> integerWorld = new GenericWorld<>();
        integerWorld.setNumber(10);
        integerWorld.transDouble();
        System.out.println(integerWorld.getNumber());

        GenericWorld<Long> longWorld = new GenericWorld<>();
        longWorld.setNumber(20L);
        integerWorld.transDouble();
        System.out.println(longWorld.getNumber());

    }
}

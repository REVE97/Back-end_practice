package AfterLecture_0430.generic.ex2;

public class BoxExMain {
    public static void main(String[] args) {
        StrictGenericBox<Integer> box = new StrictGenericBox<>();
        box.setValue(100);

        StrictGenericBox<String> box2 = new StrictGenericBox<>();
        box2.setValue("Hello");

        StrictGenericBox<Double> box3 = new StrictGenericBox<>();
        box3.setValue(3.14);
    }
}

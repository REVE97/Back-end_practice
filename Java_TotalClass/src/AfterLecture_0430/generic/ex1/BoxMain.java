package AfterLecture_0430.generic.ex1;

public class BoxMain {
    public static void main(String[] args) {
        GenericBox<Integer> box = new GenericBox<>();
        box.setValue(10);
        Integer integer = box.getValue();
        System.out.println("integer = " + integer);

        GenericBox<String> box2 = new GenericBox<>();
        box2.setValue("hello");
        String string = box2.getValue();
        System.out.println("string = " + string);
    }
}

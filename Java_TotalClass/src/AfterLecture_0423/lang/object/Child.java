package AfterLecture_0423.lang.object;

public class Child extends Parent {
    private String name = "Child";
    private int age = 20;

    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    @Override
    public String toString() {
        return "Child [name=" + name + ", age=" + age + "]";
    }
}

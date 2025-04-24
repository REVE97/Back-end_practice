package AfterLecture_0424.nested.anonymous;

public class AnonymousOuter {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString";

        // 내부에 지역 클래스 선언
        Print print = new Print() {
            String localInstance = "localInstance";

            @Override
            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("localInstance = " + localInstance);
                System.out.println("parameter = " + methodParameter);
            }
        };

        print.printLocal();
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.outerMethod("parameter");
    }
}

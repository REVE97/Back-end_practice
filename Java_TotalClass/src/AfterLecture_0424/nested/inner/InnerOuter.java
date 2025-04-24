package AfterLecture_0424.nested.inner;

public class InnerOuter {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    // 중첩 클래스
    class Inner {
        private static String nestedStatic = "innerStatic";
        private String nestedInstance = "innerInstance";

        // Helper 메서드
        public void print() {
            // 클래스 내부의 static 값에 접근
            System.out.println("innerStatic = " + nestedStatic);
            System.out.println("outerStatic = " + outerStatic);

            // 클래스 내부의 non-static 값에 접근
            System.out.println("innerInstance = " + nestedInstance);
            System.out.println("outerStatic = " + outerInstance);
        }
    }
}

package AfterLecture_0424.nested.local;

public class LocalOuter {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString";

        // 메소드 내부에 지역 클래스 작성
        class LocalInner {
            String localInstance = "localInstance";

            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("localInstance = " + localInstance);
                System.out.println("parameter = " + methodParameter);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.printLocal();
    }
}

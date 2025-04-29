package AfterLecture_0429.exception.basic;

public class ExceptionFinal {
    public static void main(String[] args) {

        try {
            int[] arr = {1,2,3,4,5};
            accessArr(arr,5);

            Object object = null;
            accessNull(object);

            object.equals(arr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
    
    public static boolean accessArr(int[] arr, int idx) {
        if (idx<arr.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean accessNull(Object obj) {
        if (obj==null) {
            return true;
        } else {
            return false;
        }
    }
}

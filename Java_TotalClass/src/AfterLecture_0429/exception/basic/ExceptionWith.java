package AfterLecture_0429.exception.basic;

public class ExceptionWith {
    public static void main(String[] args) {

        try {
            int[] arr = {1,2,3,4,5};
            accessArr(arr,5);

            Object object = null;
            accessNull(object);
        } catch (Exception e) {
            e.printStackTrace();
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

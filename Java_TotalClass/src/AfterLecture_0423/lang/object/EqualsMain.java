package AfterLecture_0423.lang.object;

public class EqualsMain {
    public static void main(String[] args) {
        User user1 = new User("John", "Doe");
        User user2 = new User("John", "Doe");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}

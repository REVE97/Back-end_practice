package AfterLecture_0423.lang.object;

import java.util.Objects;

public class User {
    private String name;
    private String id;

    User(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    // Alt + insert 에서 equals and hashCode() 를 활용하여 생성
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

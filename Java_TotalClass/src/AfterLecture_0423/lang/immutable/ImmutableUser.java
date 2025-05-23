package AfterLecture_0423.lang.immutable;

public class ImmutableUser {
    private final String name;

    public ImmutableUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "name='" + name + '\'' +
                '}';
    }
}

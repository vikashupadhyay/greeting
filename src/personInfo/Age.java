package personInfo;

public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isGreaterThanAreEquals(Object o) {
        if (this == o) return true;
        Age age1 = (Age) o;

        return age == age1.age;

    }

}

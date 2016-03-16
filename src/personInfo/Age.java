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
        Age otherAge = (Age) o;

        return age >= otherAge.age;

    }

}

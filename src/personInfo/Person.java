package personInfo;

public class Person {
    private final Name name;
    private final Age age;
    private Address address;
    private Gender gender;


    public String getAddress() {
        return address.toString();
    }

    public Person(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    private String getName() {
        return name.getFirstlastName();
    }

    public String firstLastFormat() {
        return gender.toString() + " " + getName();
    }

    public String lastFirstFormat() {
        return gender.toString() + " " + name.getLastFirstName();

    }

    public boolean isSameCountry(Country otherCountry) {
        return address.isOfCountry(otherCountry);
    }

    public boolean isSameAge(Age otherAge) {
        return age.isGreaterThanAreEquals(otherAge);
    }

}

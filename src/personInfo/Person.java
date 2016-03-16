package personInfo;

public class Person {
    private final Name name;
    private final Age age;
    private Address address;
    private Gender gender;


    public String residence() {
        return address.toString();
    }

    public Person(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }


    public String firstLastFormat() {
        return String.format("%s %s",gender, name.getFirstLastName());
    }

    public String lastFirstFormat() {
        return String.format("%s %s", gender, name.getLastFirstName());

    }

    public boolean isOfCountry(Country otherCountry) {
        return address.isNationality(otherCountry);
    }

    public boolean isOlderThan(Age otherAge) {
        return age.isGreaterThanAreEquals(otherAge);

    }
    public int age(){
        return age.getAge();
    }

}

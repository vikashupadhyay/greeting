
public class Person {
    private final Name name;
    private  Address address;
    private Gender gender;


    public Person(String firstName, String lastName, Gender gender, String[] address) {
        this.name = new Name(firstName,lastName);
        this.gender = gender;
        this.address = new Address(address);
    }

    public String getName() {
        return name.getFirstlastName();
    }

    @Override
    public String toString() {
        return gender.title() + " "+ getName() +" "+ address.getCountry();
    }
}


public class Person {
    private final Name name;
    private final Age age;
    private  Address address;
    private Gender gender;


    public Address getAddress() {
        return address;
    }

    public Age getAge() {
        return age;
    }

    public Person(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age  = age;
        this.address = address;
    }

    public String getName() {
        return name.getFirstlastName();
    }

    public String FL_templete() {
        return gender.title() + " "+ getName() +","+ address.getCountry();
    }
    public String LF_templete() {
        return gender.title() + " "+ name.getLastFirstName() +","+ address.getCountry();
    }
}


public class Name {
    String firstName;
    String lastName;

    public Name(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstlastName() {
        return firstName+" "+lastName;
    }

    public String getLastFirstName() {
        return lastName+" "+ firstName;
    }
}

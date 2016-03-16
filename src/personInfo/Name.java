package personInfo;

public class Name {
   private String firstName;
    private String lastName;

    public Name(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstLastName() {
        return String.format("%s %s",firstName,lastName);

    }

    public String getLastFirstName() {
        return String.format("%s,%s",lastName,firstName);

    }
}

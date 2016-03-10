import java.util.LinkedList;
import java.util.List;

public class GuestList {
    private final String record;

    public List<Person> getPreson() {
        return person;
    }

    private  List<Person> person = new LinkedList<Person>();

    public GuestList(String record) {

        this.record = record;
        this.person = getPreson();
    }

    public void addData() {
        String[] indivisualData = record.split("\n");
        for (String anIndivisualData : indivisualData) {
            String[] s = anIndivisualData.split(",");
            Name name = new Name(s[0], s[1]);
            Address address = new Address(s[4], s[5], s[6]);
            Age age = new Age(s[3]);
            Gender gender;
            if (s[2].equals("Male"))
                gender = Gender.Male;
            else
                gender = Gender.Female;
            Person person = new Person(name, gender,age, address);
            this.person.add(person);

        }
    }
}

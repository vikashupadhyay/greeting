import java.util.LinkedList;
import java.util.List;

public class AddingDataToPerson {
    private final String data;

    public List<Person> getPersons() {
        return persons;
    }

    private  List<Person> persons = new LinkedList<Person>();

    public AddingDataToPerson(String data) {

        this.data = data;
        this.persons = getPersons();
    }

    public void addData() {
        String[] indivisualData = data.split("\n");
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
            persons.add(person);

        }
    }
}

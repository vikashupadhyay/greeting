import java.util.LinkedList;
import java.util.List;

public class GuestList {

    private  List<Person> guestList = new LinkedList<Person>();


    public void addRecords(String record) {
        String[] individualRecords = record.split("\n");
        for (String each : individualRecords) {
            String[] splitedRecord = each.split(",");
            Name name = new Name(splitedRecord[0], splitedRecord[1]);
            Country country = new Country(splitedRecord[6]);
            State state = new State(splitedRecord[5]);
            City city = new City(splitedRecord[4]);
            Address address = new Address(city,state,country);
            Age age = new Age(Integer.parseInt(splitedRecord[3]));
            Gender gender = Gender.valueOf(splitedRecord[2]);
            Person person = new Person(name, gender,age, address);
            this.guestList.add(person);

        }

    }
    public RecordFilter filterRecord(){
        RecordFilter recordFilter = new RecordFilter(guestList);
        return recordFilter;
    }
}

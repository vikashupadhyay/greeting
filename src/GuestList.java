import personInfo.*;

import java.util.LinkedList;
import java.util.List;

public class GuestList {

    private  List<Person> guestList = new LinkedList<>();


    public void addRecords(String record) {
        String[] individualRecords = record.split("\n");
        for (String each : individualRecords) {
            String[] splittedRecord = each.split(",");
            Name name = new Name(splittedRecord[0], splittedRecord[1]);
            Country country = new Country(splittedRecord[6]);
            State state = new State(splittedRecord[5]);
            City city = new City(splittedRecord[4]);
            Address address = new Address(city,state,country);
            Age age = new Age(Integer.parseInt(splittedRecord[3]));
            Gender gender = Gender.valueOf(splittedRecord[2]);
            Person person = new Person(name, gender,age, address);
            this.guestList.add(person);

        }

    }
    public RecordFilter filterRecord(){
        return new RecordFilter(guestList);
    }
}

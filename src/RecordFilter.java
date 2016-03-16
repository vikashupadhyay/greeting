import personInfo.Age;
import personInfo.Country;
import personInfo.Person;

import java.util.ArrayList;
import java.util.List;

public class RecordFilter {
    private final List<Person> persons;


    public RecordFilter(List<Person> persons) {
        this.persons = persons;
    }

    public Object[] getfirstNameFirst() {
        ArrayList<String> firstLast = new ArrayList<>();
        for (Person person : persons) firstLast.add(person.firstLastFormat());
        return  firstLast.toArray();
    }
    public Object[] getLastNameFirst() {
        ArrayList<String> lastFirst = new ArrayList<>();
        for (Person person : persons) lastFirst.add(person.lastFirstFormat());
        return lastFirst.toArray();
    }
    public Object[] getfirstNameFirstOfGivenCountry(Country country) {
        ArrayList<String> strings = new ArrayList<>();
        for (Person person : persons)
            if (person.isOfCountry(country))
                strings.add(String.format("%s,%s",person.firstLastFormat(),country));
        return strings.toArray();
    }
    public Object[] getLastNameFirstOfGivenCountry(Country country) {
        ArrayList<String> strings = new ArrayList<>();
        for (Person person : persons)
            if (person.isOfCountry(country))
                strings.add(String.format("%s,%s",person.lastFirstFormat(),country));
        return strings.toArray();
    }
    public Object[] getFirstNameFirstGivenCountryAndAge(Country country, Age age) {
        ArrayList<String> strings = new ArrayList<>();

        for (Person person : persons)
            if (person.isOfCountry(country) && person.isOlderThan(age))
                strings.add(String.format("%s,%s,%s",person.firstLastFormat(),country,person.age()));
        return strings.toArray();
    }
    public Object[] getLastNameFirstOfGivenCountryAndAge(Country country, Age age) {
        ArrayList<String> strings = new ArrayList<>();
        for (Person person : persons)
            if (person.isOfCountry(country) && person.isOlderThan(age))
                strings.add(String.format("%s,%s,%s",person.lastFirstFormat(),country,person.age()));
        return strings.toArray();
    }

    public Object[] getFirstNameFirstWithAddress() {
        ArrayList<String> firstLastWithAddress = new ArrayList<>();
        for (Person person : persons) firstLastWithAddress.add(String.format("%s\n%s",person.firstLastFormat(),person.residence()));
        return  firstLastWithAddress.toArray();
    }

    public Object[] getLastNameFirstWithAddress() {
        ArrayList<String> firstLastWithAddress = new ArrayList<>();
        for (Person person : persons) firstLastWithAddress.add(String.format("%s\n%s",person.lastFirstFormat(),person.residence()));
        return  firstLastWithAddress.toArray();

    }
}

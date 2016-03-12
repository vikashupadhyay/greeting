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
        ArrayList<String> firstLast = new ArrayList<String>();
        for (Person person : persons) firstLast.add(person.firstLastFormat());
        return  firstLast.toArray();
    }
    public Object[] getLastNameFirst() {
        ArrayList<String> lastFirst = new ArrayList<String>();
        for (Person person : persons) lastFirst.add(person.lastFirstFormat());
        return lastFirst.toArray();
    }
    public Object[] getfirstNameFirstOfGivenCountry(Country country) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.isSameCountry(country))
                strings.add(person.firstLastFormat()+","+country);
        return strings.toArray();
    }
    public Object[] getLastNameFirstOfGivenCountry(Country country) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.isSameCountry(country))
                strings.add(person.lastFirstFormat()+","+country);
        return strings.toArray();
    }
    public Object[] getFirstNameFirstGivenCountryAndAge(Country country, Age age) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.isSameCountry(country) && person.isSameAge(age))
                strings.add(person.firstLastFormat() + ","+country+"," + age.getAge());
        return strings.toArray();
    }
    public Object[] getLastNameFirstOfGivenCountryAndAge(Country country, Age age) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.isSameCountry(country) && person.isSameAge(age))
                strings.add(person.lastFirstFormat() + ","+country+"," + age.getAge());
        return strings.toArray();
    }


}

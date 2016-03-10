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
            if (person.getAddress().isOfCountry(country))
                strings.add(person.firstLastFormat()+","+country.getCountry());
        return strings.toArray();
    }
    public Object[] getLastNameFirstOfGivenCountry(Country country) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.getAddress().isOfCountry(country))
                strings.add(person.lastFirstFormat()+","+country.getCountry());
        return strings.toArray();
    }
    public Object[] getFirstNameFirstGivenCountryAndAge(Country country, String age) {
        ArrayList<String> strings = new ArrayList<String>();
        int i = 0;
        while (i < persons.size()) {
            if(persons.get(i).getAddress().isOfCountry(country) && (persons.get(i).getAge().getAge())>=Integer.parseInt(age)) {
                strings.add(persons.get(i).firstLastFormat() + ","+country.getCountry()+"," + persons.get(i).getAge().getAge());
            }
            i++;
        }
        return strings.toArray();
    }
    public Object[] getLastNameFirstOfGivenCountryAndAge(Country country, int age) {
        ArrayList<String> strings = new ArrayList<String>();
        int i = 0;
        while (i < persons.size()) {
            persons.get(i).getAddress().isOfCountry(country);
            System.out.println(persons.get(i).getAddress().isOfCountry(country));
            if(persons.get(i).getAddress().isOfCountry(country) && (persons.get(i).getAge().getAge())>=age) {
                strings.add(persons.get(i).lastFirstFormat() + ","+country.getCountry()+"," + persons.get(i).getAge().getAge());
            }
            i++;
        }
        return strings.toArray();
    }

}

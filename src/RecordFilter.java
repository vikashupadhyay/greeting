import java.util.ArrayList;
import java.util.List;

public class RecordFilter {
    private final List<Person> persons;


    public RecordFilter(List<Person> persons) {
        this.persons = persons;
    }

    public Object[] getPersonsInFlPattern() {
        ArrayList<String> firstLast = new ArrayList<String>();
        for (Person person : persons) firstLast.add(person.firstLastFormat());
        return  firstLast.toArray();
    }
    public Object[] getPersonsInLfPattern() {
        ArrayList<String> lastFirst = new ArrayList<String>();
        for (Person person : persons) lastFirst.add(person.lastFirstFormat());
        return lastFirst.toArray();
    }
    public Object[] getPersonsInFlPatternOfGivenCountry(String country) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.getAddress().getCountry().equals(country))
                strings.add(person.firstLastFormat());
        return strings.toArray();
    }
    public Object[] getPersonsInLfPatternOfGivenCountry(String country) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.getAddress().getCountry().equals(country))
                strings.add(person.lastFirstFormat());
        return strings.toArray();
    }
    public Object[] getPersonsInFlPatternOfGivenCountryAndAge(String country, String age) {
        ArrayList<String> strings = new ArrayList<String>();
        int i = 0;
        while (i < persons.size()) {
            if(persons.get(i).getAddress().getCountry().equals(country) && (persons.get(i).getAge().getAge())>=Integer.parseInt(age)) {
                strings.add(persons.get(i).firstLastFormat() + "," + persons.get(i).getAge().getAge());
            }
            i++;
        }
        return strings.toArray();
    }
    public Object[] getPersonsInLfPatternOfGivenCountryAndAge(String country, String age) {
        ArrayList<String> strings = new ArrayList<String>();
        int i = 0;
        while (i < persons.size()) {
            if(persons.get(i).getAddress().getCountry().equals(country) && (persons.get(i).getAge().getAge())>=Integer.parseInt(age)) {
                strings.add(persons.get(i).lastFirstFormat() + "," + persons.get(i).getAge().getAge());
            }
            i++;
        }
        return strings.toArray();
    }

}

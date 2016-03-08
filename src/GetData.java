import java.util.ArrayList;
import java.util.List;

public class GetData {
    private final List<Person> persons;


    public GetData(List<Person> persons) {
        this.persons = persons;
    }

    public Object[] getPersonsInFlPattern() {
        ArrayList<String> firstLast = new ArrayList<String>();
        for (Person person : persons) firstLast.add(person.FL_templete());
        return  firstLast.toArray();
    }
    public Object[] getPersonsInLfPattern() {
        ArrayList<String> lastFirst = new ArrayList<String>();
        for (Person person : persons) lastFirst.add(person.LF_templete());
        return lastFirst.toArray();
    }
    public Object[] getPersonsInFlPatternOfGivenCountry(String country) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.getAddress().getCountry().equals(country))
                strings.add(person.FL_templete());
        return strings.toArray();
    }
    public Object[] getPersonsInLfPatternOfGivenCountry(String country) {
        ArrayList<String> strings = new ArrayList<String>();
        for (Person person : persons)
            if (person.getAddress().getCountry().equals(country))
                strings.add(person.LF_templete());
        return strings.toArray();
    }
    public Object[] getPersonsInFlPatternOfGivenCountryAndAge(String country, String age) {
        ArrayList<String> strings = new ArrayList<String>();
        int i = 0;
        while (i < persons.size()) {
            if(persons.get(i).getAddress().getCountry().equals(country) && (persons.get(i).getAge().getAge())>=Integer.parseInt(age)) {
                strings.add(persons.get(i).FL_templete() + "," + persons.get(i).getAge().getAge());
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
                strings.add(persons.get(i).LF_templete() + "," + persons.get(i).getAge().getAge());
            }
            i++;
        }
        return strings.toArray();
    }

}

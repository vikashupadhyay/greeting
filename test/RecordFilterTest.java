import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class RecordFilterTest {
    @Test
    public void testGeTPersonInFirstLastPattern() throws Exception {
        Address address = new Address("West Shanna", "Vermont", "Bangladesh");
        Name name = new Name("Melody","Dooley");
        Age age = new Age(20);
        Person person1 = new Person(name,Gender.Male,age,address);
        Person person2 = new Person(name,Gender.Male,age,address);
        LinkedList<Person> persons = new LinkedList<Person>();
        persons.add(person1);
        persons.add(person2);
        RecordFilter getData = new RecordFilter(persons);
        Assert.assertEquals(getData.getfirstNameFirst()[0],"Mr Melody Dooley,Bangladesh");

    }

    @Test
    public void testGeTPersonInLastFirstPattern() throws Exception {
        Address address = new Address("West Shanna", "Vermont", "Bangladesh");
        Name name = new Name("Melody","Dooley");
        Age age = new Age(20);
        Person person1 = new Person(name,Gender.Male,age,address);
        Person person2 = new Person(name,Gender.Male,age,address);
        LinkedList<Person> persons = new LinkedList<Person>();
        persons.add(person1);
        persons.add(person2);
        RecordFilter getData = new RecordFilter(persons);
        Assert.assertEquals(getData.getLastNameFirst()[0],"Mr Dooley,Melody,Bangladesh");

    }
    @Test
    public void testGetPersonsInFlPatternOfGivenCountry() throws Exception {
        Address address = new Address("West Shanna", "Vermont", "Bangladesh");
        Name name = new Name("Melody","Dooley");
        Age age = new Age(20);
        Person person1 = new Person(name,Gender.Male,age,address);
        Person person2 = new Person(name,Gender.Male,age,address);
        LinkedList<Person> persons = new LinkedList<Person>();
        persons.add(person1);
        persons.add(person2);
        RecordFilter getData = new RecordFilter(persons);
        Assert.assertEquals(getData.getfirstNameFirstOfGivenCountry("Bangladesh")[0],"Mr Melody Dooley,Bangladesh");

    }
    @Test
    public void testGetPersonsInLfPatternOfGivenCountry() throws Exception {
        Address address = new Address("Crooks ton","Vermont","Bangladesh");
        Name name = new Name("Alivia","Heidenreich");
        Age age = new Age(20);
        Person person1 = new Person(name,Gender.Male,age,address);
        Person person2 = new Person(name,Gender.Male,age,address);
        LinkedList<Person> persons = new LinkedList<Person>();
        persons.add(person1);
        persons.add(person2);
        RecordFilter getData = new RecordFilter(persons);
        Assert.assertEquals(getData.getLastNameFirstOfGivenCountry("Bangladesh")[0],"Mr Heidenreich,Alivia,Bangladesh");

    }
    @Test
    public void testGetPersonsInFlPatternOfGivenCountryAndAge() throws Exception {
        Address address = new Address("Crooks ton","Vermont","Bangladesh");
        Name name = new Name("Alivia","Heidenreich");
        Age age = new Age(20);
        Person person1 = new Person(name,Gender.Male,age,address);
        Person person2 = new Person(name,Gender.Male,age,address);
        LinkedList<Person> persons = new LinkedList<Person>();
        persons.add(person1);
        persons.add(person2);
        RecordFilter getData = new RecordFilter(persons);
        Assert.assertEquals(getData.getFirstNameFirstGivenCountryAndAge("Bangladesh","20")[0],"Mr Alivia Heidenreich,Bangladesh,20");

    }
    @Test
    public void testGetPersonsInLfPatternOfGivenCountryAndAge() throws Exception {
        Address address = new Address("Crooks ton","Vermont","Bangladesh");
        Name name = new Name("Alivia","Heidenreich");
        Age age = new Age(20);
        Person person1 = new Person(name,Gender.Male,age,address);
        Person person2 = new Person(name,Gender.Male,age,address);
        LinkedList<Person> persons = new LinkedList<Person>();
        persons.add(person1);
        persons.add(person2);
        RecordFilter getData = new RecordFilter(persons);
        Assert.assertEquals(getData.getLastNameFirstOfGivenCountryAndAge("Bangladesh","20")[0],"Mr Heidenreich,Alivia,Bangladesh,20");

    }
}
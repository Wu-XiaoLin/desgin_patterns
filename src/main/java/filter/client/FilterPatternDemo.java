package filter.client;

import filter.base.Criteria;
import filter.base.Person;
import filter.base.impl.FemaleCriteria;
import filter.base.impl.MaleCriteria;
import filter.base.impl.SingleCriteria;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bob","male","single"));
        personList.add(new Person("Lucy","female","single"));
        personList.add(new Person("Jack","male","Marry"));
        personList.add(new Person("Marilyn","female","single"));


        Criteria male = new MaleCriteria();
        Criteria female = new FemaleCriteria();
        Criteria single = new SingleCriteria();

        System.out.println("Meal Person :");
        printPerson(male.meetCriteria(personList));

        System.out.println("Female Person :");
        printPerson(female.meetCriteria(personList));

        System.out.println("Single Person :");
        printPerson(single.meetCriteria(personList));

    }

    public static void printPerson(List<Person> personList){
        for (Person person: personList) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}

package filter.base.impl;

import filter.base.Criteria;
import filter.base.Person;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();
        for (Person person: persons) {
            if(person.getGender().equalsIgnoreCase("male")){
                personList.add(person);
            }
        }
        return personList;
    }
}

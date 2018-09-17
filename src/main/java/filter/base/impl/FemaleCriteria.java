package filter.base.impl;

import filter.base.Criteria;
import filter.base.Person;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();
        for (Person p: persons) {
            if(p.getGender().equalsIgnoreCase("female")){
                personList.add(p);
            }
        }
        return personList;
    }
}

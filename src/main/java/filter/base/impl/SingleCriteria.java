package filter.base.impl;

import filter.base.Criteria;
import filter.base.Person;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();
        for (Person p: persons) {
            if(p.getMaritalStatus().equalsIgnoreCase("single")){
                personList.add(p);
            }
        }
        return personList;
    }
}

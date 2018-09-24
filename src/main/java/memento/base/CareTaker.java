package memento.base;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();


    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int i) {
        return mementoList.get(i);
    }
}

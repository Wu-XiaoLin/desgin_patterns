package iterator.client;

import iterator.base.Iterator;
import iterator.base.impl.NameRepository;

/**
 * 迭代器模式
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("over");
    }
}

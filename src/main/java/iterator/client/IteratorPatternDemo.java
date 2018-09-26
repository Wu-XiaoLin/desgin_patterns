package iterator.client;

import iterator.base.Iterator;
import iterator.base.impl.NameRepository;

/**
 * 迭代器模式
 * 使用场景：1、访问一个聚合对象的内容而无需暴露他的内部实现。
 *          2、需要为聚合对象提供多种遍历方式。
 *          3、为遍历不同的聚合结构提供一个统一的接口。
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

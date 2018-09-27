package memento.client;

import memento.base.CareTaker;
import memento.base.Originator;

/**
 * 备忘录模式
 * 使用场景: 1、需要保存/恢复数据的相关状态场景。
 *          2、提供一个可回滚的操作。
 * 注意事项：1、为了符合迪米特原则，还要增加一个管理备忘录的类。
 *          2、为了节省内存，可使用原型模式+备忘录模式。
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("#1");
        originator.setState("#2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("#3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("#4");

        System.out.println("当前状态："+ originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("保存的第一个状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("保存的第二个状态: " + originator.getState());

    }
}

package mediator.client;

import mediator.base.User;

/**
 * 中介者模式
 * 使用场景：1、系统中对象之间存在比较复杂的引用关系，导致他们之间的依赖关系结构混乱而且难以复用该对象。
 *          2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
 */
public class MediatorPatternDemo {

    public static void main(String[] args) throws InterruptedException {

        User user = new User("张三丰");
        User user1 = new User("李淼");

        user1.sendMessage("大家好");
        Thread.sleep(1000);
        user.sendMessage("你好，你好");
    }
}

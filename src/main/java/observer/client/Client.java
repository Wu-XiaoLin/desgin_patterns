package observer.client;

import observer.observer.Architect;
import observer.observer.JuniorEngineer;
import observer.subject.AbstractHR;
import observer.subject.HeadHunter;

/**
 * 观察者模式
 * 使用场景：1、有多个子类共有的方法，且逻辑相同。
 *          2、重要的、复杂的方法，可以考虑作为模板方法。
 * 注意事项：1、JAVA 中已经有了对观察者模式的支持类。
 *          2、避免循环引用。
 *          3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
 */
public class Client {

    public static void main(String[] args) {
        AbstractHR hr = new HeadHunter();
        hr.addTalent(new Architect());
        hr.addTalent(new JuniorEngineer());

        hr.publishJob("某某互联网企业高级工程师");

    }
}

package observer.client;

import observer.observer.Architect;
import observer.observer.JuniorEngineer;
import observer.subject.AbstractHR;
import observer.subject.HeadHunter;

/**
 * 观察者模式
 */
public class Client {

    public static void main(String[] args) {
        AbstractHR hr = new HeadHunter();
        hr.addTalent(new Architect());
        hr.addTalent(new JuniorEngineer());

        hr.publishJob("某某互联网企业高级工程师");

    }
}

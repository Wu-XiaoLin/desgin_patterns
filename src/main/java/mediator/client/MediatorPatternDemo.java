package mediator.client;

import mediator.base.User;

public class MediatorPatternDemo {

    public static void main(String[] args) throws InterruptedException {

        User user = new User("张三丰");
        User user1 = new User("李淼");

        user1.sendMessage("大家好");
        Thread.sleep(1000);
        user.sendMessage("你好，你好");


    }
}

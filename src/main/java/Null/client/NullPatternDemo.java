package Null.client;

import Null.base.AbstractCustomer;
import Null.base.CustomerFactory;

/**
 * 空对象模式
 * 在空对象模式中，我们创建一个指定各种要执行的操作的抽象类和扩展该类的实体类，
 * 还创建一个未对该类做任何实现的空对象类，该空对象类将无缝地使用在需要检查空值的地方。
 */
public class NullPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("王五");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("李四");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("张三");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("钱六");


        System.out.println("customers ：");
        System.out.println(customer1.getName() + " --- class : " + customer1.getClass());
        System.out.println(customer2.getName() + " --- class : " + customer2.getClass());
        System.out.println(customer3.getName() + " --- class : " + customer3.getClass());
        System.out.println(customer4.getName() + " --- class : " + customer4.getClass());


    }
}

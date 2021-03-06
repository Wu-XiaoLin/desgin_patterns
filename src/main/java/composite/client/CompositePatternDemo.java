package composite.client;

import composite.base.Employee;

/**
 * 组合模式
 * 何时使用：1、表示对象的部分-整体层次结构（树形结构）。
 * 2、希望用户忽略单个对象和组合对象的不同，用户将统一的使用组合结构中的所有对象。
 *
 */
public class CompositePatternDemo {

    public static void main(String[] args) {
        Employee CEO = new Employee("刘老板","CEO",50000.0);

        Employee headSale = new Employee("张主管","Sale",9000.0);

        Employee headMarketing = new Employee("王经理","Head Marketing", 20000.0);

        Employee clerk1 = new Employee("马三胖","Marketing", 10000.0);
        Employee clerk2 = new Employee("钱四水","Marketing", 10000.0);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000.0);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000.0);

        CEO.add(headSale);
        CEO.add(headMarketing);

        headSale.add(salesExecutive1);
        headSale.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }
}

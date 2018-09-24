package prototype.client;

import prototype.base.ClassRoom;
import prototype.base.Student;
import single.Singleton;

/**
 * 原型模式：浅拷贝
 * 使用场景：1、资源优化场景
 * 2、类初始化需要消耗非常多的资源，这个资源包括数据和硬件资源等；
 * 3、性能和安全要求的场景。
 * 4、通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式；
 * 5、一个对象多个修改者的场景；
 * 6、一个对象需要提供给其它对象访问，而调用者都可能要修改其值时，可以考虑拷贝使用原型模式拷贝多个对象供调用者使用；
 * 7、在实际项目中，原型模式很少单独出现，一般是和工厂方法模式一起出现，通过clone的方法创建一个对象，然后由工厂方法提供给调用者；
 */
public class ProtoypePatternDemo {

    public static void main(String[] args) {


        Student student = new Student();
        student.setName("小美");
        student.setAge(5);
        student.setClassRoom(new ClassRoom("宝宝班", "中班", Singleton.getInstance()));

        Student stu = student.clone();
        ClassRoom cr = stu.getClassRoom();
        cr.setName("亲亲班");

        System.out.println(student);
        System.out.println(stu);
    }
}

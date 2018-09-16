package prototype.client;

import prototype.base.ClassRoom;
import prototype.base.Student;
import single.Singleton;

/**
 * 浅拷贝
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

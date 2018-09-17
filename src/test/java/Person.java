import java.io.File;

public class Person {
    public String Name;
    public int Age;

    public Person() {
    }

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}

class ReferenceAndValue {
    public static void main(String[] args) {
        Person zerocool = new Person ("酷酷",25) ;
        Person anders = new Person ("啊啊",47);

        int age = zerocool.getAge();
        zerocool.Age = 22;

        Person guru = anders;
        anders.Name = "Anders  河北";

        System.out.println("zerocool's age:\t"+ zerocool.Age);
        System.out.println("age's value:\t"+ age);
        System.out.println("anders' name:\t"+ anders.Name);
        System.out.println("guru' name:\t"+ guru.Name);

        System.out.println(new File(ReferenceAndValue.class.getResource("/").getPath()));
    }
}
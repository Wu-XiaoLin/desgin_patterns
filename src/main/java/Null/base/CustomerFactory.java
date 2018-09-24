package Null.base;

public class CustomerFactory {

    public static final String[] names = {"张三", "李四", "王五"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

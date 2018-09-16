package single;

/**
 * 懒汉式加载 非线程安全 支持延迟加载
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    public static Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    private Singleton2() {}
}

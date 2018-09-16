package single;

/**
 * 饿汉式 线程安全 不支持延迟初始化
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }

    private Singleton() {}
}

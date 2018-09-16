package single;

/**
 * 懒汉式（静态内部类） 线程安全 支持延迟加载
 */
public class Singleton5 {

    private Singleton5() {}

    private static class SingletonHolder{
        private static final Singleton5 singleton5 = new Singleton5();
    }

    public static final Singleton5 getInstance(){
        return SingletonHolder.singleton5;
    }
}

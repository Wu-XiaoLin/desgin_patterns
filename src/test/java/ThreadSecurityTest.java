import single.Singleton4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSecurityTest {

    public static ExecutorService executor = Executors.newScheduledThreadPool(10);
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {
        SingletonThreadSecurityTest test = new SingletonThreadSecurityTest();

        for (int i = 0; i < 10000; i++) {
            executor.execute(test);
        }
        executor.shutdown();

        while (true){
            Thread.sleep(5000);
            System.out.println("singleton4  size = " + Singleton4.getInstance().getSize());
            break;
        }

    }


    public static class SingletonThreadSecurityTest implements Runnable {

        @Override
        public void run() {
            Singleton4 singleton4 = Singleton4.getInstance();
            singleton4.add();
            Integer tl = threadLocal.get();
            if (tl == null) {
                tl = 1;
            } else {
                tl = tl + 1;
            }
            threadLocal.set(tl);
            //System.out.println(singleton4.getSize());
            //System.out.println(Thread.currentThread().getName() + "  tl Value = " + tl);
        }
    }

    private static class CallTest implements Runnable {

        @Override
        public void run() {
            System.out.println("很懵逼，不知道要干什么" + ThreadSecurityTest.threadLocal.get());
        }
    }
}
package proxy.client;

import proxy.base.Image;
import proxy.base.impl.ProxyImage;

/**
 * 代理模式
 * 使用场景：1、远程代理
 *          2、虚拟代理
 *          3、Copy-on-Write代理
 *          4、保护代理
 *          5、Cache代理
 *          6、防火墙代理
 *          。。。。。。
 * 注意事项：1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 *          2、和装饰器模式的区别；装饰器模式为了增加功能，而代理模式是为了加以控制。
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("test.png");

        proxyImage.display();
        System.out.println("图片显示完毕");
        proxyImage.display();
        proxyImage.display();
    }
}

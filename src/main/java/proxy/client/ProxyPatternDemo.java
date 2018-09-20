package proxy.client;

import proxy.base.Image;
import proxy.base.impl.ProxyImage;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("test.png");

        proxyImage.display();
        System.out.println("图片显示完毕");
        proxyImage.display();
        proxyImage.display();
    }
}

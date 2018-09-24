package flyweight.client;

import flyweight.base.ShapeFactory;
import flyweight.base.impl.Circle;

/**
 * 享元模式
 * 使用场景：1、系统中有大量的相似对象。
 *          2、需要缓冲池的场景。
 *
 * 注意事项：1、注意划分外部状态和内部状态，否则可能会引起线程安全问题。
 *          2、这些类必须有一个工厂对象加以控制。
 */
public class FlyweightPatternDemo {

    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}

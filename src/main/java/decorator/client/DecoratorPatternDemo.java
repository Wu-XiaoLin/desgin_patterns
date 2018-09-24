package decorator.client;

import decorator.base.Shape;
import decorator.base.impl.Circle;
import decorator.base.impl.Rectangle;
import decorator.base.impl.RedShapeDecorator;

/**
 * 装饰器模式
 * 使用场景：扩展一个类的功能
 *  动态增加功能，动态撤销
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("普通圆");
        circle.draw();

        System.out.println("红色边框的圆");
        redCircle.draw();

        System.out.println("红色的长方形");
        redRectangle.draw();

    }
}

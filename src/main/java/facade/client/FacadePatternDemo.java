package facade.client;

import facade.base.ShapeMaker;

/**
 * 外观模式
 * 使用场景：1、为复杂的模块或子系统提供外界访问的模块；
 *          2、子系统相对独立；
 *          3、预防低水平人员带来的风险
 *
 *  注意：类似于JAVA 的三层开发模式。
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}

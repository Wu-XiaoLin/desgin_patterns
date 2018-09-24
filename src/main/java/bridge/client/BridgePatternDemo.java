package bridge.client;

import bridge.base.Circle;
import bridge.base.Shape;
import bridge.base.impl.GreenCircle;
import bridge.base.impl.RedCircle;

/**
 * 桥接模式
 *使用场景：1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，
 * 避免在两个层次之间建立静态的继承关系，通过桥接模式可以使它们在抽象层建立一个
 * 关联关系。
 * 2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 * 3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 *
 * 注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了！！！
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape shape = new Circle(100,100,10,new RedCircle());
        Shape shapeG = new Circle(100,100,10,new GreenCircle());

        shape.draw();
        shapeG.draw();
    }
}

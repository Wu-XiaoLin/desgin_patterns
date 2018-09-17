package bridge.client;

import bridge.base.Circle;
import bridge.base.Shape;
import bridge.base.impl.GreenCircle;
import bridge.base.impl.RedCircle;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape shape = new Circle(100,100,10,new RedCircle());
        Shape shapeG = new Circle(100,100,10,new GreenCircle());

        shape.draw();
        shapeG.draw();
    }
}

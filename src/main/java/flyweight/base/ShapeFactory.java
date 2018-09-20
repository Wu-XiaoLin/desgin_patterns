package flyweight.base;

import flyweight.base.impl.Circle;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    public static final Map<String,Shape> circleMap = new HashMap<>();

    public static Shape  getCircle(String color){
        Circle shape = (Circle) circleMap.get(color);
        if(shape == null){
            shape = new Circle(color);
            circleMap.put(color,shape);
        }
        return shape;
    }

}

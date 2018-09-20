package facade.base.impl;

import facade.base.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a square");
    }
}

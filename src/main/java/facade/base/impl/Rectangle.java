package facade.base.impl;

import facade.base.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw a rectangle");
    }
}

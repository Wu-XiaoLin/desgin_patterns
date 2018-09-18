package decorator.base;

public abstract class ShapeDecorator implements Shape {

    public Shape shape;

    public ShapeDecorator(Shape decoratorShape) {
        this.shape = decoratorShape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

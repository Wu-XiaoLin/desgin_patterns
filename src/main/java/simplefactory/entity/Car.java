package simplefactory.entity;

public abstract class Car {

    protected String name;

    public abstract void drive();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

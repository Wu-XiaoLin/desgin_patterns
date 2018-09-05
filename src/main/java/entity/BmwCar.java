package entity;

public class BmwCar extends Car {

    public BmwCar() {
        super();
        super.name = "别摸我牌小汽车";
    }

    @Override
    public void drive() {
        System.out.println(getName() + "就要发车了！");
    }
}

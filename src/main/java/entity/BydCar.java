package entity;

public class BydCar extends Car {

    public BydCar() {
        super();
        super.name = "国产神车-比亚迪";
    }

    @Override
    public void drive() {
        System.out.println(getName() + "大佬就要发车了！");
    }
}

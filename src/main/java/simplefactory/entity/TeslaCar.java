package simplefactory.entity;

public class TeslaCar extends Car {

    public TeslaCar() {
        super();
        super.name = "最牛皮的新能源汽车";
    }

    @Override
    public void drive(){
        System.out.println(getName() + "最皮的特斯拉就要发车啦");
    }
}

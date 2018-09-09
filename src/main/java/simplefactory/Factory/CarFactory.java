package simplefactory.Factory;

import simplefactory.entity.BmwCar;
import simplefactory.entity.BydCar;
import simplefactory.entity.Car;
import simplefactory.entity.TeslaCar;

import java.io.IOException;
import java.util.Properties;

/**
 * 简单工厂模式
 * @author 11325
 * @date 208-09-08 23:13
 */
public class CarFactory {

    public static Properties pro = new Properties();

    static {
        try {
            pro.load(CarFactory.class.getResourceAsStream("/conf.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Car car = CarFactory.newCar();
//        Car car = simpleNewCar();
        if(car != null){
            car.drive();
        }

    }




    public static Car simpleNewCar(){
        String name = pro.getProperty("factory.name");
        Car car = null;
        try {
            car = (Car) Class.forName(name).newInstance();
            return car;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return car;
    }

    private static Car newCar() {
        String name = pro.getProperty("factory.name");
        Car car = null;
        switch (name){
            case "BydCar" : {
                car = new BydCar();
                break;
            }
            case "BmwCar" : {
                car = new BmwCar();
                break;
            }
            case "TeslaCar" : {
                car = new TeslaCar();
                break;
            }
            default:{
                car = null;
            }
        }
        return car;
    }

}

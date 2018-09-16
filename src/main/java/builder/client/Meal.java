package builder.client;

import builder.base.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();


    public Meal addItem(Item item){
        items.add(item);
        return this;
    }

    public float getTotalPrice(){
        float price = 0;
        for (Item item: items) {
            price += item.price();
        }
        return price;
    }

    public void showItems(){
        for (Item item: items) {
            System.out.println("商品名：" +item.name() + ",包装：" + item.packing().pack() + ",价格" + item.price());
        }
    }
}

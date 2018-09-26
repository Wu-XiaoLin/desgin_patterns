package command.client;

import command.base.Broker;
import command.base.impl.BuyStock;
import command.base.impl.SellStock;
import command.base.impl.Stock;

/**
 * 命令模式
 * 使用场景：认为是命令的地方都可以使用命令模式，比如：
 *          1、GUI 中每一个按钮都是一条命令。
 *          2、模拟 CMD。
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}

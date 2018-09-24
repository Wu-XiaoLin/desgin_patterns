package command.base.impl;

import command.base.Order;

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void excute() {
        stock.sell();
    }
}

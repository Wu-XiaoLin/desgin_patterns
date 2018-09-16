package builder.base.impl;

import builder.base.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 7;
    }
}

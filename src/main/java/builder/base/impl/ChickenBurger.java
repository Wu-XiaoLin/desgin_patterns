package builder.base.impl;

import builder.base.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 25.5F;
    }
}

package builder.base.impl;

import builder.base.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }


    @Override
    public float price() {
        return 15;
    }
}

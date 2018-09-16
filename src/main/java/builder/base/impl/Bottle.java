package builder.base.impl;

import builder.base.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "这是一个瓶子";
    }
}

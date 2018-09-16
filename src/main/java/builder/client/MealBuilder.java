package builder.client;

import builder.base.impl.ChickenBurger;
import builder.base.impl.Coke;
import builder.base.impl.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal().addItem(new VegBurger()).addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal().addItem(new ChickenBurger()).addItem(new Coke());
        return meal;
    }
}

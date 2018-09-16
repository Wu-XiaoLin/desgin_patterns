package builder.client;

import builder.base.impl.Coke;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareNonVegMeal();
        meal.showItems();
        System.out.println("非素食金额为:" + meal.getTotalPrice());

        meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        System.out.println("素食金额为:" + meal.getTotalPrice());

        System.out.println("再加一杯可乐怎么样！");
        meal.addItem(new Coke());
        System.out.println("这顿素食餐花费了" + meal.getTotalPrice());
    }
}

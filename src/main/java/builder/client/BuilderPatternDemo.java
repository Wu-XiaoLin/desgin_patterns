package builder.client;

import builder.base.impl.Coke;

/**
 * 建造者模式
 * 使用场景:一些基本部件不会变，但是其组合经常变化的时候(参考OkHttp的Request构建方法)。
 */
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

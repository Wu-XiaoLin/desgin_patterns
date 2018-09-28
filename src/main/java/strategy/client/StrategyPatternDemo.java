package strategy.client;

import strategy.base.Context;
import strategy.base.impl.OperationAdd;
import strategy.base.impl.OperationMultiply;
import strategy.base.impl.OperationSubstract;

/**
 * 策略模式
 * 使用场景：1、如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。
 *          2、一个系统需要动态地在几种算法中选择一种。
 *          3、如果一个对象有很多的行为，如果不用恰当的模式，这些行为就只好使用多重的条件选择语句来实现。
 * 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.excuteStrategy(10, 5));

        Context context1 = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context1.excuteStrategy(10, 5));

        Context context2 = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context2.excuteStrategy(10, 5));

    }
}

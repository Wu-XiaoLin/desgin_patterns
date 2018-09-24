package strategy.client;

import strategy.base.Context;
import strategy.base.impl.OperationAdd;
import strategy.base.impl.OperationMultiply;
import strategy.base.impl.OperationSubstract;

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

package state.client;

import state.base.Context;
import state.base.impl.StartState;
import state.base.impl.StopState;

/**
 * 状态模式
 * 使用场景： 1、行为随状态改变而改变的场景。
 *           2、条件、分支语句的代替者。
 * 注意事项： 在行为受状态约束的时候使用状态模式，而且状态不超过 5 个。
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);


        System.out.println(context.getState().toString());

    }
}

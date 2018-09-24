package state.client;

import state.base.Context;
import state.base.impl.StartState;
import state.base.impl.StopState;

/**
 * 状态模式
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

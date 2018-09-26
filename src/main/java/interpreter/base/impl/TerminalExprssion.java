package interpreter.base.impl;

import interpreter.base.Expression;

public class TerminalExprssion implements Expression {
    private String data;

    public TerminalExprssion(String data) {
        this.data = data;
    }


    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}

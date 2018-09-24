package interpreter.base.impl;

import interpreter.base.Exprssion;

public class TerminalExprssion implements Exprssion {
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

package interpreter.base.impl;

import interpreter.base.Exprssion;

public class AndExprssion implements Exprssion {
    private Exprssion expr1;
    private Exprssion expr2;

    public AndExprssion(Exprssion expr1, Exprssion expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}

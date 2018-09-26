package interpreter.base.impl;

import interpreter.base.Expression;

public class AndExprssion implements Expression {
    private Expression expr1;
    private Expression expr2;

    public AndExprssion(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}

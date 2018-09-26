package interpreter.client;

import interpreter.base.Expression;
import interpreter.base.impl.AndExprssion;
import interpreter.base.impl.OrExprssion;
import interpreter.base.impl.TerminalExprssion;

/**
 * 解释器模式
 * 使用场景：1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树；
 *          2、一些重复出现的问题可以用一种简单的语言来进行表达；
 *          3、一个简单的语法需要解释的场景下；
 */
public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarrieWoman = getmarriedWomenexpression();

        System.out.println("jack is male？result：" + isMale.interpret("jack") );
        System.out.println("lucy is mariedWoman？ result：" + isMarrieWoman.interpret("lucy married"));

   }

    public static Expression getMaleExpression() {
        Expression jack = new TerminalExprssion("jack");
        Expression bob = new TerminalExprssion("bob") ;
        return new OrExprssion(jack,bob);
    }

    public static Expression getmarriedWomenexpression() {
        Expression lucy = new TerminalExprssion("lucy");
        Expression married = new TerminalExprssion("married");
        return new AndExprssion(lucy,married);
    }

}

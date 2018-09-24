package interpreter.client;

import interpreter.base.Exprssion;
import interpreter.base.impl.AndExprssion;
import interpreter.base.impl.OrExprssion;
import interpreter.base.impl.TerminalExprssion;

public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Exprssion isMale = getMaleExpression();
        Exprssion IsMarrieWoman = getmarriedWomenexpression();

        System.out.println("jack is male？result：" + isMale.interpret("jack") );
        System.out.println("lucy is mariedWoman？ result：" + IsMarrieWoman.interpret("lucy married"));

   }

    public static Exprssion getMaleExpression() {
        Exprssion jack = new TerminalExprssion("jack");
        Exprssion bob = new TerminalExprssion("bob") ;
        return new OrExprssion(jack,bob);
    }

    public static Exprssion getmarriedWomenexpression() {
        Exprssion lucy = new TerminalExprssion("lucy");
        Exprssion married = new TerminalExprssion("married");
        return new AndExprssion(lucy,married);
    }

}

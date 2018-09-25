package visitor.base;

import visitor.base.impl.Computer;
import visitor.base.impl.KeyBoard;
import visitor.base.impl.Monitor;
import visitor.base.impl.Mouse;

public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(KeyBoard keyBoard);

    void visit(Monitor monitor);

}

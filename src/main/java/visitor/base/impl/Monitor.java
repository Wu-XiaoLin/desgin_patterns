package visitor.base.impl;

import visitor.base.ComputerPart;
import visitor.base.ComputerPartVisitor;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

package visitor.base.impl;

import visitor.base.ComputerPart;
import visitor.base.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(),new KeyBoard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

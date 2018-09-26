package visitor.client;

import visitor.base.ComputerPart;
import visitor.base.impl.Computer;
import visitor.base.impl.ComputerPartDisplayVisitor;

/**
 * 访问者模式
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

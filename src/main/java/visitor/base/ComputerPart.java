package visitor.base;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}

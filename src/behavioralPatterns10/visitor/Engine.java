package behavioralPatterns10.visitor;

public class Engine implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String checkEngine() {
        return "Engine Ok";
    }
}

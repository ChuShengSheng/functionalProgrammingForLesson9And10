package behavioralPatterns10.visitor;

public class Brake implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String replaceBrakePad() {
        return "brake replaced";
    }
}

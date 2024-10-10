package behavioralPatterns10.visitor;

public class Transmission implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    String refreshOil() {
        return "Transmission Oil refreshed";
    }
}

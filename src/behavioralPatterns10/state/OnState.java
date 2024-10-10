package behavioralPatterns10.state;

public class OnState implements State {
    @Override
    public State action() {
        System.out.println("светит");
        return StateProvider.getOffState();
    }
}

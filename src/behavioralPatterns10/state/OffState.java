package behavioralPatterns10.state;

public class OffState implements State {

    @Override
    public State action() {
        System.out.println("не светит");
        return StateProvider.getOnState();
    }
}

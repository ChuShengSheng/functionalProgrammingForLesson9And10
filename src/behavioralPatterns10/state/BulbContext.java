package behavioralPatterns10.state;

public class BulbContext {
    private State state = StateProvider.getOffState();

    public void performAction() {
        this.setState(state.action());
    }

    public void setState(State state) {
        this.state = state;
    }
}

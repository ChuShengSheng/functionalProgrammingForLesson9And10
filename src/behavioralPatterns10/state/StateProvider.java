package behavioralPatterns10.state;

public class StateProvider {
    public static State getOnState() {
        return new OnState();
    }

    public static State getOffState() {
        return new OffState();
    }
}

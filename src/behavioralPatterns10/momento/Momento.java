package behavioralPatterns10.momento;

import java.time.LocalDateTime;

public class Momento {
    private final State state;
    private final LocalDateTime createdAt;

    public Momento(State state, LocalDateTime createdAt) {
        this.state = new State(state);
        this.createdAt = createdAt;
    }

    public State getState() {
        return state;
    }
}

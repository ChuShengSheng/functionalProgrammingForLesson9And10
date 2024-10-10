package behavioralPatterns10.momento;

import java.util.Arrays;

public class State {
    private String[] array;

    public State(String[] array) {
        this.array = array;
    }

    public State(State state) {
        this.array = Arrays.copyOf(state.getArray(), state.getArray().length);
    }

    public String[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "State{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}

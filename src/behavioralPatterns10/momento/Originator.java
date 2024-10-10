package behavioralPatterns10.momento;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class Originator {

    //Фактически, это stack
    private final Deque<Momento> stack = new ArrayDeque<>();
    private final LocalDateTime localDateTime;

    public Originator(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

   public void saveState(State abc) {
        stack.push(new Momento(abc, localDateTime));
   }

   public State restoreState() {
        return stack.peek().getState();
   }
}

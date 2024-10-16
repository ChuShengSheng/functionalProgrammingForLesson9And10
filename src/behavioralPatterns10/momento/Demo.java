package behavioralPatterns10.momento;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        var originator = new Originator(LocalDateTime.now());

        var abc = new State(new String[]{"A", "B", "C"});
        System.out.println(abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A1";
        System.out.println(abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A2";
        System.out.println(abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A3";
        System.out.println(abc);

        System.out.println("undo changes");
        //откат на й состояние назад
        abc = originator.restoreState();
        System.out.println(abc);

        abc = originator.restoreState();
        System.out.println(abc);

        abc = originator.restoreState();
        System.out.println(abc);
    }
}

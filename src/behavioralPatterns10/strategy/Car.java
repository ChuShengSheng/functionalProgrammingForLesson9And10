package behavioralPatterns10.strategy;

public class Car implements Strategy {
    @Override
    public void transportation() {
        System.out.println("Доехать на машине");
    }
}

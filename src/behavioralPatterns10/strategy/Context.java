package behavioralPatterns10.strategy;

public class Context {
    private Strategy strategy;
    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void applyStrategy() {
        strategy.transportation();
    }
}

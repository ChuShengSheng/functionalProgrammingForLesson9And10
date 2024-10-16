package structuralPatternsL10.security.lazy;

public class HeavyObjectImpl implements HeavyObject {
    private String value;
    private boolean isInit;

    @Override
    public void init(String value) {
        this.value = value;
        this.isInit = true;
        System.out.println("heavy long initialization");
    }

    @Override
    public boolean isInit() {
        return isInit;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "HeavyObjectImpl{" +
                "value='" + value + '\'' +
                ", isInit=" + isInit +
                '}';
    }
}

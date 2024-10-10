package structuralPatternsL10.flyweight;

public class ObjectFactory {
    private final HeavyCommonPart heavyCommonPart;

    public ObjectFactory() {
        this.heavyCommonPart = new HeavyCommonPart();
    }

    public Object create(int x) {
        return new ObjectOnLine(x, heavyCommonPart);
    }
}

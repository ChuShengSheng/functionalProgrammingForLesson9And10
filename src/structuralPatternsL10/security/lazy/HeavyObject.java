package structuralPatternsL10.security.lazy;

public interface HeavyObject {
    void init(String value);

    boolean isInit();

    String getValue();
}

package behavioralPatterns10.command;

import java.util.Objects;

public class SomeObject {
    private String value;

    public SomeObject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeObject that = (SomeObject) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String
    toString() {
        return "SomeObject{" +
                "value='" + value + '\'' +
                '}';
    }
}

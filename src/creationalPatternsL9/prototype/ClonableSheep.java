package creationalPatternsL9.prototype;

import java.util.Objects;

public class ClonableSheep implements Cloneable{
    private String name;

    public ClonableSheep(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClonableSheep that = (ClonableSheep) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public ClonableSheep clone() throws CloneNotSupportedException {
        return (ClonableSheep) super.clone();
    }
}

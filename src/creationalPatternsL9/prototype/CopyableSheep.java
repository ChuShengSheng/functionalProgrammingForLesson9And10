package creationalPatternsL9.prototype;

import java.util.Objects;

public class  CopyableSheep implements Copyable<CopyableSheep>{

    private String name;

    public CopyableSheep(String name) {
        this.name = name;
    }

    @Override
    public CopyableSheep copy(){
        return new CopyableSheep(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CopyableSheep that = (CopyableSheep) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }
}

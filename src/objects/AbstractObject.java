package objects;

import java.util.Objects;

public abstract class AbstractObject {
    private String name;
    public AbstractObject(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Имя объекта: "+getName();
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || o.getClass() != getClass()) { return false; }

        AbstractObject x = (AbstractObject) o;

        return x.getName() == this.getName();
    }
}

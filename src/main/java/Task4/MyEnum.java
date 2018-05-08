package Task4;


import java.io.Serializable;

public class MyEnum<E extends Enum<E>>
        implements  Comparable<MyEnum>, Serializable{

    private final String name;
    private final int ordinal;

    public MyEnum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public final String name() {
        return name;
    }

    public int compareTo(MyEnum o) {
        return this.ordinal - o.ordinal;
    }
}

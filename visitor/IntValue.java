package visitor;

public class IntValue implements ReturnValue <Integer>{

    public Integer value;

    public IntValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "IntValue{" +
                "value=" + value +
                '}';
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}

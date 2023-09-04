package visitor;

public class StringValue implements ReturnValue <String>{

    private String value;

    public StringValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "StringValue{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}

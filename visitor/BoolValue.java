package visitor;

public class BoolValue implements ReturnValue <Boolean> {

    private Boolean value;

    public BoolValue(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getValue() {
        return value;
    }

    @Override
    public void print() {
        if(value) {
            System.out.println(Constants.TRUE);
        } else {
            System.out.println(Constants.FALSE);
        }
    }
}

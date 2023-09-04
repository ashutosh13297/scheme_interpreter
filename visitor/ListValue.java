package visitor;

import java.util.ArrayList;
import java.util.List;

public class ListValue implements ReturnValue <List<Integer>>{
    public List<Integer> list;

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public ListValue(List<Integer> list) {
        this.list = list;
    }

    public ListValue(ListValue listValue) {
        this.list = listValue.list;
    }

    @Override
    public List<Integer> getValue() {
        return list;
    }

    @Override
    public void print() {
        StringBuilder output = new StringBuilder("(");
        for(Integer val : list) {
            output.append(val).append(" ");
        }
        output = new StringBuilder(output.toString().trim());
        output.append(")");
        System.out.println(output);
    }
}

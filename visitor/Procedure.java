package visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Procedure implements ReturnValue {

    private List<ReturnValue> formalPrams;
    private ReturnValue body;

    private Environment parentEnv;

    public Procedure() {
        this.formalPrams = new ArrayList<>();
    }

    public Procedure(Procedure procedure) {
        this.formalPrams = procedure.formalPrams;
        this.body = procedure.getBody();
        this.parentEnv = procedure.getParentEnv();
    }

    @Override
    public ReturnValue getValue() {
        return body;
    }

    public void addParameter(ReturnValue value) {
        formalPrams.add(value);
    }

    public List<ReturnValue> getFormalPrams() {
        return formalPrams;
    }

    public void setFormalPrams(List<ReturnValue> formalPrams) {
        this.formalPrams = formalPrams;
    }

    public ReturnValue getBody() {
        return body;
    }

    public void setBody(ReturnValue body) {
        this.body = body;
    }

    public Environment getParentEnv() {
        return parentEnv;
    }

    public void setParentEnv(Environment parentEnv) {
        this.parentEnv = parentEnv;
    }

    @Override
    public String toString() {
        return "Procedure{" +
                "formalPrams=" + formalPrams +
                ", body=" + body +
                ", parentEnv=" + parentEnv +
                '}';
    }

    @Override
    public void print() {
        StringBuilder out = new StringBuilder();
        for(ReturnValue par : formalPrams) {
            out.append(par.getValue().toString()).append(" ");
        }
        System.out.println(String.format(Constants.PROC_MSG, out.toString().trim()));
    }
}

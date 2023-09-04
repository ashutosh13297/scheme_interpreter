package visitor;

import java.util.HashMap;
import java.util.Map;

public class Environment {
    public Map<String, ReturnValue> table;

    public Environment parentEnv;

    public Environment() {
        table = new HashMap<>();
    }

    public Environment(Environment parentEnv) {
        table = new HashMap<>();
        this.parentEnv = parentEnv;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "table=" + table.keySet() +
                ", parentEnv=" + parentEnv +
                '}';
    }
}

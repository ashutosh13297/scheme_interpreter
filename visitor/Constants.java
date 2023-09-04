package visitor;

public class Constants {

    public static final String TRUE = "#t";
    public static final String FALSE = "#f";

    public static final String ERROR_MSG = "Symbol '%s' not found in the environment.";
    public static final String ERROR_ARG_MSG = "foo: arity mismatch;\n" +
            " the expected number of arguments does not match the given number\n" +
            "  expected: %d\n" +
            "  given: %d";
    public static final String PROC_MSG = "<procedure: lambda (%s)>";
}

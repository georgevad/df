package org.example.package1;

/**
 * TODO - javadoc
 */
public class ClassUsed {

    //public
    public static final String UNUSED_PUSF = "";
    public final String UNUSED_PUF = "";
    public String UNUSED_PU = "";

    //package visibility
    static final String UNUSED_SF = "";
    final String UNUSED_F = "";
    String UNUSED = "";

    //protected
    protected static final String UNUSED_PRSF = "";
    protected final String UNUSED_PRF = "";
    protected String UNUSED_PR = "";

    private static class InnerClassUnused {}

    private interface InnerIntefaceUnused {}

    private enum InnerEnumUnused{}

    private void methodUnused(){}
    private String unusedGlobalVariable;

    private String used;
    private ClassUsed() {

        used = "";
    }

    public String method(String usedParam, String unusedParam) {
        String methodLocalVariableUnused;
        return used + usedParam;
    }

}

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

    private static class InnerClassUnused extends InnerClassUsed implements InterfaceUsed {}

    private interface InnerIntefaceUnused {}

    private enum InnerEnumUnused{}

    private void methodUnused(){}
    private void methodUsed() {}
    private String unusedGlobalVariable;

    private interface InterfaceUsed {

    }

    private static class InnerClassUsed {

    }



    private String used;
    private ClassUsed() {

        used = "";
    }

    public String method(String usedParam, String unusedParam) {
        String methodLocalVariableUnused;
        methodUsed();
        return used + usedParam;
    }

}

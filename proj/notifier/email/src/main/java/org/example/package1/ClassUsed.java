package org.example.package1;

/**
 * TODO - javadoc
 */
public class ClassUsed {

    private static class InnerClassUnused {}

    private interface InnerIntefaceUnused {}

    private enum InnerEnumUnused{}

    private void methodUnused(){}
    private String unusedGlobalVariable;

    private String used;
    public ClassUsed() {

        used = "";
    }


    public String method(String usedParam, String unusedParam) {
        String unusedLocalVariable;
        return used + usedParam;
    }

}

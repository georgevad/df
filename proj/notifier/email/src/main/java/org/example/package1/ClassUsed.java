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
    private ClassUsed() {

        used = "";
    }

    public String method(String usedParam, String unusedParam) {
        return used + usedParam;
    }

}

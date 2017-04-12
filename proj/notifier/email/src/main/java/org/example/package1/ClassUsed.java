package org.example.package1;

/**
 * TODO - javadoc
 */
public class ClassUsed {

    private String unused;

    private String used;
    public ClassUsed() {

        used = "";
    }


    public String method(String usedParam, String unusedParam) {
        return used + usedParam;
    }

}

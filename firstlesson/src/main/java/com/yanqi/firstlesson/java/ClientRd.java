package com.yanqi.firstlesson.java;

/**
 * author : yanqi
 * date   : 2019-07-29 14:16
 */
public class ClientRd extends Rd {

    public ClientRd(boolean useJava) {
        super(useJava);
    }

    public ClientRd(boolean useJava, boolean useAndroid) {
        super(useJava, useAndroid);
    }

    public ClientRd(boolean useJava, boolean useAndroid, boolean useFlutter) {
        super(useJava, useAndroid, useFlutter);
    }

    @Override
    public String code(String demand) {
        if ("flutter".equals(demand)) {
            return codeClient(demand, "useFlutter");
        } else {
            return codeClient(demand);
        }
    }

    private String codeClient(String demand) {
        String tempCode = "Client+";
        return tempCode;
    }

    private String codeClient(String demand, String flutter) {
        String tempCode = "Client+Flutter+" + flutter + "+";
        return tempCode;
    }
}

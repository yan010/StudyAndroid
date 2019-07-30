package com.yanqi.firstlesson.java;

/**
 * author : yanqi
 * date   : 2019-07-29 14:20
 */
public class AndroidRd extends ClientRd {
    public AndroidRd(boolean useJava) {
        super(useJava);
    }

    public AndroidRd(boolean useJava, boolean useAndroid) {
        super(useJava, useAndroid);
    }

    public AndroidRd(boolean useJava, boolean useAndroid, boolean useFlutter) {
        super(useJava, useAndroid, useFlutter);
    }

    @Override
    public String code(String demand) {
        return super.code(demand) + codeAndroid(demand);
    }

    private String codeAndroid(String demand) {
        String tempCode = "android";
        return tempCode;
    }
}

package com.yanqi.firstlesson.java;

/**
 * author : yanqi
 * date   : 2019-07-29 14:15
 */
public class Rd {
    protected boolean useJava;
    protected boolean useAndroid;
    protected boolean useFlutter;


    public Rd(boolean useJava) {
        this(useJava, false, false);
    }

    public Rd(boolean useJava, boolean useAndroid) {
        this(useJava, useAndroid, false);
    }

    public Rd(boolean useJava, boolean useAndroid, boolean useFlutter) {
        this.useJava = useJava;
        this.useAndroid = useAndroid;
        this.useAndroid = useFlutter;
    }

    public String code(String demand) {
        return "我没有具体的能力，我什么需求也不会做";
    }
}

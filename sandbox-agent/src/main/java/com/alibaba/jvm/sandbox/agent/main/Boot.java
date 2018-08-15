package com.alibaba.jvm.sandbox.agent.main;

public class Boot {

    public static void main(String[] args) throws Exception {

        Class res = GroovyUtils.compileFile("script/Print.groovy");

        if (res == null) {
            return;
        }
        Object ins = res.newInstance();
        if (ins instanceof MyInterface) {
            ((MyInterface) ins).print();
        }
    }

}

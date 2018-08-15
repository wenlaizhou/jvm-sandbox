package com.alibaba.jvm.sandbox.agent.main;

public class Boot {

    public static void main(String[] args) throws Exception {

        Class res = GroovyUtils.compileFile("script/Print.groovy");

        MyInterface ins = (MyInterface) res.newInstance();
        System.out.println(ins.print());

    }

}

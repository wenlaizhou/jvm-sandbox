package com.alibaba.jvm.sandbox.agent.main;

import groovy.lang.GroovyClassLoader;

public class Boot {

    public static void main(String[] args) {
        GroovyClassLoader loader = new GroovyClassLoader();
        System.out.println(loader.generateScriptName());
    }

}

package com.alibaba.jvm.sandbox.agent.main;

import groovy.lang.GroovyClassLoader;

public class GroovyUtils {

    public static Class compile(String script) {
        GroovyClassLoader loader = new GroovyClassLoader();
        return loader.parseClass(script);
    }

}

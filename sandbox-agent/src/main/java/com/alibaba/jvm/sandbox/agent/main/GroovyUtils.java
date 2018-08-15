package com.alibaba.jvm.sandbox.agent.main;

import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class GroovyUtils {

    public static Class compile(String script) {
        GroovyClassLoader loader = new GroovyClassLoader();
        return loader.parseClass(script);
    }

    public static Class compileFile(String filePath) {
        GroovyClassLoader loader = new GroovyClassLoader();
        File groovyFile = new File(filePath);
        if (!groovyFile.exists() || groovyFile.isDirectory()) {
            return null;
        }
        try {
            return loader.parseClass(groovyFile);
        }
        catch (IOException x) {
            return null;
        }
    }

    public static Object execCode(String code) throws ResourceException, ScriptException {
        GroovyScriptEngine engine = new GroovyScriptEngine(new URL[0]);
        return engine.run(code, new Binding());
    }

    public static Object execCodeFile(String codePath) throws ResourceException, ScriptException, IOException {
        GroovyScriptEngine engine = new GroovyScriptEngine(new URL[0]);
        File f = new File(codePath);
        if (!f.exists() || f.isDirectory()) {
            throw new ScriptException("code is not exist!");
        }
        String code = FileUtils.readFileToString(f);
        return engine.run(code, new Binding());
    }

}

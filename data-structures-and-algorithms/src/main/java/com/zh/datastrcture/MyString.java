package com.zh.datastrcture;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MyString {


    public static void main(String[] args) throws ScriptException {
        ScriptEngine se = new ScriptEngineManager().getEngineByExtension("javascript");
        se.eval("");
    }
}

package com.kotyk.morsedecoder.parser;

import java.util.HashMap;
import java.util.Map;

public abstract class MorseDeCoder {

    protected static final Map<Character, String> map = new HashMap<>();

    static {
        map.put('a', "._");
        map.put('b', "_...");
        map.put('c', "_._.");
        map.put('d', "_..");
        map.put('e', ".");
        map.put('f', ".._.");
        map.put('g', "__.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".___");
        map.put('k', "_._");
        map.put('l', "._..");
        map.put('m', "__");
        map.put('n', "_.");
        map.put('o', "___");
        map.put('p', ".__.");
        map.put('q', "__._");
        map.put('r', "._.");
        map.put('s', "...");
        map.put('t', "_");
        map.put('u', ".._");
        map.put('v', "..._");
        map.put('w', ".__");
        map.put('x', "_.._");
        map.put('y', "_.__");
        map.put('z', "__..");
        map.put('0', "_____");
        map.put('1', ".____");
        map.put('2', "..___");
        map.put('3', "...__");
        map.put('4', "...._");
        map.put('5', ".....");
        map.put('6', "_....");
        map.put('7', "__...");
        map.put('8', "___..");
        map.put('9', "____.");
        map.put(' ', "//");
    }

    public abstract String parseToText(String morse);

    public abstract String parseToMorse(String text);
}

package com.kotyk.morsedecoder.parser;

import java.util.HashMap;
import java.util.Map;

public abstract class MorseDeCoder {

    /**
     * Map for parsing text to mose code
     */
    private static final Map<Character, String> CHAR_TO_MORSE = new HashMap<>();
    /**
     * Map for parsing morse code to text
     */
    private static final Map<String, Character> MORSE_TO_CHAR = new HashMap<>();

    static {

        CHAR_TO_MORSE.put('a', "._");     CHAR_TO_MORSE.put('b', "_...");   CHAR_TO_MORSE.put('c', "_._.");
        CHAR_TO_MORSE.put('d', "_..");    CHAR_TO_MORSE.put('e', ".");      CHAR_TO_MORSE.put('f', ".._.");
        CHAR_TO_MORSE.put('g', "__.");    CHAR_TO_MORSE.put('h', "....");   CHAR_TO_MORSE.put('i', "..");
        CHAR_TO_MORSE.put('j', ".___");   CHAR_TO_MORSE.put('k', "_._");    CHAR_TO_MORSE.put('l', "._..");
        CHAR_TO_MORSE.put('m', "__");     CHAR_TO_MORSE.put('n', "_.");     CHAR_TO_MORSE.put('o', "___");
        CHAR_TO_MORSE.put('p', ".__.");   CHAR_TO_MORSE.put('q', "__._");   CHAR_TO_MORSE.put('r', "._.");
        CHAR_TO_MORSE.put('s', "...");    CHAR_TO_MORSE.put('t', "_");      CHAR_TO_MORSE.put('u', ".._");
        CHAR_TO_MORSE.put('v', "..._");   CHAR_TO_MORSE.put('w', ".__");    CHAR_TO_MORSE.put('x', "_.._");
        CHAR_TO_MORSE.put('y', "_.__");   CHAR_TO_MORSE.put('z', "__..");   CHAR_TO_MORSE.put('0', "_____");
        CHAR_TO_MORSE.put('1', ".____");  CHAR_TO_MORSE.put('2', "..___");  CHAR_TO_MORSE.put('3', "...__");
        CHAR_TO_MORSE.put('4', "...._");  CHAR_TO_MORSE.put('5', ".....");  CHAR_TO_MORSE.put('6', "_....");
        CHAR_TO_MORSE.put('7', "__...");  CHAR_TO_MORSE.put('8', "___..");  CHAR_TO_MORSE.put('9', "____.");
        CHAR_TO_MORSE.put(' ', "");       CHAR_TO_MORSE.put('.', "......"); CHAR_TO_MORSE.put(',',".-.-.-");
        CHAR_TO_MORSE.put('?', "..--.."); CHAR_TO_MORSE.put('!', "--..--"); CHAR_TO_MORSE.put('@', ".--.--.");
        CHAR_TO_MORSE.put('-', "-....-"); CHAR_TO_MORSE.put('/', "-..-.");  CHAR_TO_MORSE.put('(', "-.--.");
        CHAR_TO_MORSE.put(')', "-.--.-");

        for (HashMap.Entry<Character, String> entry : CHAR_TO_MORSE.entrySet()) {
            MORSE_TO_CHAR.put(entry.getValue(), entry.getKey());
        }

    }

    protected final String getMorseValue(Character ch) {
        return CHAR_TO_MORSE.get(ch);
    }

    protected final Character getLetterValue(String morse) {
        return MORSE_TO_CHAR.get(morse);
    }

    public abstract String parseToText(String morse);

    public abstract String parseToMorse(String text);

}

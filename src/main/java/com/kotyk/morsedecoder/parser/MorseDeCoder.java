package com.kotyk.morsedecoder.parser;

import java.util.HashMap;
import java.util.Map;

public abstract class MorseDeCoder {

    /**
     * Map for parsing text to mose code
     */
    private static final Map<Character, String> CHAR_STR_MAP = new HashMap<>();
    /**
     * Map for parsing morse code to text
     */
    private static final Map<String, Character> STR_CHAR_MAP = new HashMap<>();

    static {

        CHAR_STR_MAP.put('a', "._");     CHAR_STR_MAP.put('b', "_...");   CHAR_STR_MAP.put('c', "_._.");
        CHAR_STR_MAP.put('d', "_..");    CHAR_STR_MAP.put('e', ".");      CHAR_STR_MAP.put('f', ".._.");
        CHAR_STR_MAP.put('g', "__.");    CHAR_STR_MAP.put('h', "....");   CHAR_STR_MAP.put('i', "..");
        CHAR_STR_MAP.put('j', ".___");   CHAR_STR_MAP.put('k', "_._");    CHAR_STR_MAP.put('l', "._..");
        CHAR_STR_MAP.put('m', "__");     CHAR_STR_MAP.put('n', "_.");     CHAR_STR_MAP.put('o', "___");
        CHAR_STR_MAP.put('p', ".__.");   CHAR_STR_MAP.put('q', "__._");   CHAR_STR_MAP.put('r', "._.");
        CHAR_STR_MAP.put('s', "...");    CHAR_STR_MAP.put('t', "_");      CHAR_STR_MAP.put('u', ".._");
        CHAR_STR_MAP.put('v', "..._");   CHAR_STR_MAP.put('w', ".__");    CHAR_STR_MAP.put('x', "_.._");
        CHAR_STR_MAP.put('y', "_.__");   CHAR_STR_MAP.put('z', "__..");   CHAR_STR_MAP.put('0', "_____");
        CHAR_STR_MAP.put('1', ".____");  CHAR_STR_MAP.put('2', "..___");  CHAR_STR_MAP.put('3', "...__");
        CHAR_STR_MAP.put('4', "...._");  CHAR_STR_MAP.put('5', ".....");  CHAR_STR_MAP.put('6', "_....");
        CHAR_STR_MAP.put('7', "__...");  CHAR_STR_MAP.put('8', "___..");  CHAR_STR_MAP.put('9', "____.");
        CHAR_STR_MAP.put(' ', "");       CHAR_STR_MAP.put('.', "......"); CHAR_STR_MAP.put(',',".-.-.-");
        CHAR_STR_MAP.put('?', "..--.."); CHAR_STR_MAP.put('!', "--..--"); CHAR_STR_MAP.put('@', ".--.--.");

        STR_CHAR_MAP.put("._", 'a');     STR_CHAR_MAP.put("_...", 'b');   STR_CHAR_MAP.put("_._.", 'c');
        STR_CHAR_MAP.put("_..", 'd');    STR_CHAR_MAP.put(".", 'e');      STR_CHAR_MAP.put(".._.", 'f');
        STR_CHAR_MAP.put("__.", 'g');    STR_CHAR_MAP.put("....", 'h');   STR_CHAR_MAP.put("..", 'i');
        STR_CHAR_MAP.put(".___", 'j');   STR_CHAR_MAP.put("_._", 'k');    STR_CHAR_MAP.put("._..", 'l');
        STR_CHAR_MAP.put("__", 'm');     STR_CHAR_MAP.put("_.", 'n');     STR_CHAR_MAP.put("___", 'o');
        STR_CHAR_MAP.put(".__.", 'p');   STR_CHAR_MAP.put("__._", 'q');   STR_CHAR_MAP.put("._.", 'r');
        STR_CHAR_MAP.put("...", 's');    STR_CHAR_MAP.put("_", 't');      STR_CHAR_MAP.put(".._", 'u');
        STR_CHAR_MAP.put("..._", 'v');   STR_CHAR_MAP.put(".__", 'w');    STR_CHAR_MAP.put("_.._", 'x');
        STR_CHAR_MAP.put("_.__", 'y');   STR_CHAR_MAP.put("__..", 'z');   STR_CHAR_MAP.put("_____", '0');
        STR_CHAR_MAP.put(".____", '1');  STR_CHAR_MAP.put("..___", '2');  STR_CHAR_MAP.put("...__", '3');
        STR_CHAR_MAP.put("...._", '4');  STR_CHAR_MAP.put(".....", '5');  STR_CHAR_MAP.put("_....", '6');
        STR_CHAR_MAP.put("__...", '7');  STR_CHAR_MAP.put("___..", '8');  STR_CHAR_MAP.put("____.", '9');
        STR_CHAR_MAP.put("", ' ');       STR_CHAR_MAP.put("......", '.'); STR_CHAR_MAP.put(".-.-.-" , ',');
        STR_CHAR_MAP.put("..--..", '?'); STR_CHAR_MAP.put("--..--", '!'); STR_CHAR_MAP.put(".--.--.", '@');
    }

    protected final String getMorseValue(Character ch) {
        return CHAR_STR_MAP.get(ch);
    }

    protected final Character getLetterValue(String morse) {
        return STR_CHAR_MAP.get(morse);
    }

    public abstract String parseToText(String morse);

    public abstract String parseToMorse(String text);

}

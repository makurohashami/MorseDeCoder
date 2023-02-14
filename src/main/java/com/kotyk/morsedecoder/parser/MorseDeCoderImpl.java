package com.kotyk.morsedecoder.parser;

public class MorseDeCoderImpl extends MorseDeCoder {

    @Override
    public String parseToText(String morse) {
        return null;
    }

    @Override
    public String parseToMorse(String text) {
        text = text.trim().toLowerCase();
        StringBuilder morse = new StringBuilder();
        for (int i = 0; i < text.length(); ++i) {
            if (getValue(text.charAt(i)) == null) continue;
            morse.append(getValue(text.charAt(i))).append(" ");
        }
        return morse.toString();
    }
}

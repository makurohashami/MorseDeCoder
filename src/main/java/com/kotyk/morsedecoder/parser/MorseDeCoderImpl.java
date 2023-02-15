package com.kotyk.morsedecoder.parser;

public class MorseDeCoderImpl extends MorseDeCoder {

    @Override
    public String parseToText(String morse) {
        try {
            String[] morses = morse.trim().split(" ");
            StringBuilder text = new StringBuilder();
            for (String mors : morses) {
                if (getLetterValue(mors) == null) continue;
                text.append(getLetterValue(mors));
            }
            return text.toString();
        } catch (NullPointerException e) {
            return "bad morse";
        }
    }

    @Override
    public String parseToMorse(String text) {
        try {
            text = text.trim().toLowerCase();
            StringBuilder morse = new StringBuilder();
            for (int i = 0; i < text.length(); ++i) {
                if (getMorseValue(text.charAt(i)) == null) continue;
                morse.append(getMorseValue(text.charAt(i))).append(" ");
            }
            return morse.toString();
        } catch (NullPointerException e) {
            return "text is null";
        }
    }
}

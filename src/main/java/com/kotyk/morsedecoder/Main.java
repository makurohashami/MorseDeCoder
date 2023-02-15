package com.kotyk.morsedecoder;

import com.kotyk.morsedecoder.parser.MorseDeCoder;
import com.kotyk.morsedecoder.parser.MorseDeCoderImpl;

public class Main {
    public static void main(String[] args) {
        MorseDeCoder deCoder = new MorseDeCoderImpl();

        System.out.println(deCoder.parseToMorse("Factory Method is a...? !@.,"));
        System.out.println(deCoder.parseToText(deCoder.parseToMorse("Factory Method is ah? !@.,")));
        System.out.println(deCoder.parseToText(deCoder.parseToMorse("Imagine that you’re creating a logistics management application.")));

    }
}

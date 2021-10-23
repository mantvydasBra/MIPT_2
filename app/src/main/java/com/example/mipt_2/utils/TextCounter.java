package com.example.mipt_2.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCounter {
    public static int getWordsCount(String phrase){
        String[] words = phrase.split("[ ,.]+");
        return words.length;
    }

    public static int getPuncCount(String phrase){
        Pattern p = Pattern.compile("\\p{Punct}"); // checks for !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
        Matcher m = p.matcher(phrase);
        int puncCount = 0;
        while (m.find()) {
            puncCount++;    // while matcher can find punctuations
        }
        return puncCount;
    }
}

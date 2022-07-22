package com.futurecollars.taskFive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import static com.futurecollars.taskFive.Letters.distinctLettersFromWords;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Zażółć", "gęślą", "jaźń");

        HashSet<String> characters = distinctLettersFromWords(words);
        System.out.println(characters);
    }
}

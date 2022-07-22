package com.futurecollars.taskFive;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class Letters {

    public static HashSet<String> distinctLettersFromWords(List<String> words) {
        HashSet<String> letters = new HashSet<>();
        for (String word : words) {
            word.codePoints().mapToObj(character -> String.valueOf((char) character))
                    .distinct()
                    .forEach(letter -> letters.add(letter.toUpperCase(Locale.ROOT)));
        }
        return letters;
    }
}

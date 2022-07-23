package com.futurecollars.taskOne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleByThreeValidator {

    public static List<Integer> integersDivisibleByThree(int lowerBound, int upperBound) {
        if (lowerBound > upperBound) {
            return new ArrayList<>();
        }
        return IntStream.range(lowerBound, upperBound)
                .filter(number -> number % 3 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}

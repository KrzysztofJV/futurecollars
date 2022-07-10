package com.futurecollars.lesson6_9;

public class NumberDivisibleByThree {

    public void validate(int[] values) {

        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException("Number " + value + " is not divisible by three.");
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}

package com.futurecollars.lesson6_8;

public class PeselValidator {

    public static void validatePesel(String pesel) {

        if (!pesel.matches("\\d+?")) {
            throw new WrongTypeOfDataException("Only digits are allowed.");
        }

        if (pesel.length() != 11) {
            throw new IllegalLengthException("PESEL should be exactly eleven digits.");
        }
    }
}

package com.futurecollars.taskSix;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BirthDate {

    public static LocalDate parseDate(String birthDate) {
        return LocalDate.parse(birthDate);
    }

    public static DayOfWeek computeDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    public static int weekOfYear(LocalDate date) {
        return (date.getDayOfYear() / 7) + 1;
    }

    public static int computeAge(LocalDate date) {
        LocalDate dateNow = LocalDate.now();
        return dateNow.getYear() - date.getYear();
    }
}

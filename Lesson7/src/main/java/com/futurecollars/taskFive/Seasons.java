package com.futurecollars.taskFive;

import java.time.Month;

public enum Seasons {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    public static Seasons of(Month month) {
        return switch (month) {
            case JANUARY, FEBRUARY, DECEMBER -> Seasons.WINTER;
            case MARCH, APRIL, MAY -> Seasons.SPRING;
            case JUNE, JULY, AUGUST -> Seasons.SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> Seasons.AUTUMN;
        };
    }
}

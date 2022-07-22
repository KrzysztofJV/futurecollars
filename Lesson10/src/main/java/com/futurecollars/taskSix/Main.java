package com.futurecollars.taskSix;

import java.time.LocalDate;
import static com.futurecollars.taskSix.BirthDate.*;

public class Main {

    public static void main(String[] args) {

        String birthDate = "1996-07-03";
        LocalDate dateParsed = parseDate(birthDate);

        System.out.println(computeAge(dateParsed) + " " + computeDayOfWeek(dateParsed) + " " + weekOfYear(dateParsed));
    }
}

package com.futurecollars.taskFour;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctors {

    public static List<String> doctorsSpecializations(List<String> doctors) {
        List<String> list = doctors.stream().map(doctor -> doctor.split(":"))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        list.removeIf(element -> element.equals("Szpital") || element.equals("Przychodnia"));
        return list;
    }
}

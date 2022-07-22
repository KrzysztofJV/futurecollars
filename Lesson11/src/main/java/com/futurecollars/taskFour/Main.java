package com.futurecollars.taskFour;

import java.util.Arrays;
import java.util.List;
import static com.futurecollars.taskFour.Doctors.doctorsSpecializations;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra", "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");

        List<String> specializations = doctorsSpecializations(list);
        System.out.println(specializations);
    }
}

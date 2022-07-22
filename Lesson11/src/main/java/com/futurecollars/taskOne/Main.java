package com.futurecollars.taskOne;

import java.util.List;
import static com.futurecollars.taskOne.DivisibleByThreeValidator.integersDivisibleByThree;

public class Main {

    public static void main(String[] args) {
        List<Integer> filteredNumbers = integersDivisibleByThree(0, 100);
        System.out.println(filteredNumbers);
    }
}

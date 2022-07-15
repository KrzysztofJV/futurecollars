package com.futurecollars.taskEight;

public class SalaryCalculator {

    private final BaseSalaryService baseSalaryService;
    private final SaturdaySalaryService saturdaySalaryService;

    public SalaryCalculator(BaseSalaryService baseSalaryService, SaturdaySalaryService saturdaySalaryService) {
        this.baseSalaryService = baseSalaryService;
        this.saturdaySalaryService = saturdaySalaryService;
    }

    public double calculateSalary(String surname, double bonus, int numberOfSaturday) {
        return baseSalaryService.fetchBaseSalary(surname) + bonus + (saturdaySalaryService.fetchSaturdaySalary(surname) * numberOfSaturday);
    }
}

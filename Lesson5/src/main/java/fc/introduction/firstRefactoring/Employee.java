package fc.introduction.firstRefactoring;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final String surName;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    public static final String whiteSpace = " ";

    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Employee(String name, String surName, int age) {
        this.name = name;
        this.age = age;
        this.surName = surName;
    }

    public Employee(String name, String surName, int age, BigDecimal baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.surName = surName;
    }

    public Employee(String name, int age, BigDecimal baseSalary, BigDecimal bonus, String surName) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surName = surName;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + whiteSpace + surName;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + whiteSpace + surName + " is " + age;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }
}

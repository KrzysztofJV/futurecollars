package fc.introduction.firstRefactoring;

public class Employee {

    public static final String WHITE_SPACE = " ";
    private final String name;
    private final String surName;
    private int age;
    private int baseSalary;
    private int bonus;


    public Employee(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Employee(String name, String surName, int age) {
        this.name = name;
        this.age = age;
        this.surName = surName;
    }

    public Employee(String name, String surName, int age, int baseSalary) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.surName = surName;
    }

    public Employee(String name, int age, int baseSalary, int bonus, String surName) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surName = surName;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + WHITE_SPACE + surName;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surName + " is " + age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public int getTotalSalary() {
        return baseSalary + bonus;
    }
}

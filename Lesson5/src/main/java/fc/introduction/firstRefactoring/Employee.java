package fc.introduction.firstRefactoring;

public class Employee {

    private static final String WHITE_SPACE = " ";
    private final String name;
    private final String surName;
    private int age;
    private int baseSalary;
    private int bonus;


    public Employee(String name, int age, int baseSalary, int bonus, String surName) {
        this(name, surName, age, baseSalary);
        this.bonus = bonus;
    }

    public Employee(String name, String surName, int age, int baseSalary) {
        this(name, surName, age);
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surName, int age) {
        this(name, surName);
        this.age = age;
    }

    public Employee(String name, String surName) {
        this.name = name;
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

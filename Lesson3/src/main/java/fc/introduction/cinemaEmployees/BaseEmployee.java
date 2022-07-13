package fc.introduction.cinemaEmployees;

public abstract class BaseEmployee {

    private static final int DEFAULT_SALARY = 3000;
    private final String name;
    private final String surname;
    private final int basicSalary;
    private final int yearOfEmployment;

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this(name, surname, DEFAULT_SALARY, yearOfEmployment);
    }

    public BaseEmployee(String name, String surname, int basicSalary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.basicSalary = basicSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getYearOfEmployment() {
        return 2022-yearOfEmployment;
    }
}

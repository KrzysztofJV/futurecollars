package fc.introduction.cinemaEmployees;

public abstract class BaseEmployee {

    private String name;
    private String surname;
    private final int basicSalary;
    private final int yearOfEmployment;

    public BaseEmployee(String name, String surname, int basicSalary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.basicSalary = basicSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public abstract int calculateMonthlySalary();

    public int getBasicSalary() {
        return basicSalary;
    }

    public int getYearOfEmployment() {
        return 2022-yearOfEmployment;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", basicSalary=" + basicSalary +
                ", yearOfEmployment=" + yearOfEmployment +
                '}';
    }
}

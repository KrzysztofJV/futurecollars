package fc.introduction.cinemaEmployees;

public class Manager extends BaseEmployee{

    private static final int DEFAULT_BONUS = 500;
    private static final int DEFAULT_SALARY = 5000;
    private int salaryBonus;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, DEFAULT_SALARY, yearOfEmployment);
        this.salaryBonus = DEFAULT_BONUS;
    }

    public Manager(String name, String surname, int basicSalary, int yearOfEmployment) {
        super(name, surname, basicSalary, yearOfEmployment);
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary()+salaryBonus;
    }

    @Override
    public int getYearOfEmployment() {
        return super.getYearOfEmployment();
    }
}

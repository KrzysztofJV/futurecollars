package fc.introduction.cinemaEmployees;

public class Manager extends BaseEmployee{

    private int salaryBonus=500;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, 5000, yearOfEmployment);
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

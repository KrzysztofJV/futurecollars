package fc.introduction.cinemaEmployees;

public class TicketSeller extends BaseEmployee{

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }

    public TicketSeller(String name, String surname, int basicSalary, int yearOfEmployment) {
        super(name, surname, basicSalary, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary();
    }
}

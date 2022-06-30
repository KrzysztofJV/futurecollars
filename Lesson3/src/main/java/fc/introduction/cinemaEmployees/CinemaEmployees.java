package fc.introduction.cinemaEmployees;

public class CinemaEmployees {

    public static void main(String[] args) {

        Manager manager1 = new Manager("John", "Smith", 2019);
        manager1.setSalaryBonus(700);
        TicketSeller ticketSeller1 = new TicketSeller("Mike", "Murphy", 2015);

        System.out.println();
        System.out.println("Manager salary: " + manager1.calculateMonthlySalary());
        System.out.println("Year of employment: " + manager1.getYearOfEmployment());
        System.out.println();
        System.out.println("Ticket seller salary: " + ticketSeller1.calculateMonthlySalary());
        System.out.println("Year of employment: " + ticketSeller1.getYearOfEmployment());
    }
}

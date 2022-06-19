package fc.introduction.cinemaEmployees;

public class CinemaEmployees {

    public static void main(String[] args) {

        Manager manager = new Manager("John","Smith",2019);
        System.out.println(manager.toString());
        manager.setSalaryBonus(800);
        System.out.println(manager.calculateMonthlySalary());
        System.out.println(manager.getYearOfEmployment());

        TicketSeller ticketSeller = new TicketSeller("Majk","Stuff",2015);
        System.out.println(ticketSeller.toString());
        System.out.println(ticketSeller.getYearOfEmployment());
    }
}

package fc.introduction;

public class CinemaHall {

    public static void main(String[] args) {
        CinemaSeat cinemaSeat = new CinemaSeat(12, 5, false);
        printCinemaSeat(cinemaSeat);

    }

    private static void makeReservation() {
        System.out.println("The seat is free. You can book this seat.");
    }

    private static void chooseDifferentSeat() {
        System.out.println("You have to choose another seat. This seat is booked.");
    }

    public static void printCinemaSeat(CinemaSeat cinemaSeat){

        if (cinemaSeat.isSeatFree()) {
            chooseDifferentSeat();
        } else {
            makeReservation();
        }
    }
}

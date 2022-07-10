package fc.introduction.cinema;

public class CinemaSeat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean isTaken;

    public CinemaSeat(int numberOfSeat, int rowNumber, boolean isTaken) {
        this.seatNumber = numberOfSeat;
        this.rowNumber = rowNumber;
        this.isTaken = false;
    }

    public boolean isFree(){
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }
}

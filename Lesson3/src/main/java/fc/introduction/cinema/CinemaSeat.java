package fc.introduction.cinema;

public class CinemaSeat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean state;

    public CinemaSeat(int numberOfSeat, int rowNumber, boolean state) {
        this.seatNumber = numberOfSeat;
        this.rowNumber = rowNumber;
        this.state = state;
    }

    public boolean isSeatFree(){
        return state;
    }
}

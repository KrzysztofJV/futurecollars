package fc.introduction;

public class CinemaSeat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean state;

    public CinemaSeat(int numberOfSeat, int rowNumber, boolean state) {
        this.seatNumber = numberOfSeat;
        this.rowNumber = rowNumber;
        this.state = state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isSeatFree(){
        return state;
    }
}

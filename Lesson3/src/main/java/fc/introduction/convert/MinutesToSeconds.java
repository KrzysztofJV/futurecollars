package fc.introduction.convert;

public class MinutesToSeconds {

    public static void main(String[] args) {

    }

    public static int convertMinutesToSeconds(int minutes) {
        if (minutes >= 0) {
            return minutes*60;
        } else {
            throw new RuntimeException();
        }
    }
}

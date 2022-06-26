package fc.introduction.days;

public class NamesOfTheDays {

    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;
        System.out.println(day);
    }

    public static String getNameOfTheDay(DaysOfTheWeek daysOfTheWeek){
        return daysOfTheWeek.toString();
    }
}

package fc.introduction.fizzBuzz;

public class FizzBuzz {

    private final int minValue, maxValue;

    public FizzBuzz(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public void getFizzBuzz(){
        for (int i = minValue; i < maxValue+1; i++) {
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

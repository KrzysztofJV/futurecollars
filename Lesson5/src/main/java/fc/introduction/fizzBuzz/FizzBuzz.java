package fc.introduction.fizzBuzz;

public class FizzBuzz {

    public void getFizzBuzz(int minValue, int maxValue){
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

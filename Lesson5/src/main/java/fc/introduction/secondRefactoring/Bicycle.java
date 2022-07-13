package fc.introduction.secondRefactoring;

public class Bicycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("The bike starts to go.");
    }

    @Override
    public void stop() {
        System.out.println("The bike stop.");
    }
}

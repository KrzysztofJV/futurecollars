package fc.introduction.secondRefactoring;

public class Car implements Vehicle {

    private final Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("The engine is started:");
        engine.start();
        System.out.println("The car goes.");
    }

    @Override
    public void stop() {
        System.out.println("The engine is stopped:");
        engine.stop();
        System.out.println("The car stop.");
    }
}

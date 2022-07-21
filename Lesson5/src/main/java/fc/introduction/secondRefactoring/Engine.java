package fc.introduction.secondRefactoring;

public class Engine{

    private boolean started;

    public void start() {
        if (!started) {
            started = true;
        }
    }

    public void stop() {
        if (started) {
            started = false;
        }
    }

    public boolean isStarted() {
        return started;
    }
}

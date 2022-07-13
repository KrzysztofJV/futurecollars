package fc.introduction.secondRefactoring;

public class Engine{

    private boolean started;

    protected void start() {
        if (!started) {
            started = true;
        }
    }

    protected void stop() {
        if (started) {
            started = false;
        }
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}

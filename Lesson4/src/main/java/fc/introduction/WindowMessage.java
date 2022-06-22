package fc.introduction;

public class WindowMessage extends Message{

    @Override
    String getMessage() {
        return "This is class " + WindowMessage.class.getSimpleName();
    }
}

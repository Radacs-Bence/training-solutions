package collectionsqueue.job;

public class NoJobException extends Exception{

    public NoJobException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

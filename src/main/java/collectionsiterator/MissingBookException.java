package collectionsiterator;

public class MissingBookException extends RuntimeException {

    public MissingBookException() {
        super();
    }

    public MissingBookException(String message) {
        super(message);
    }
}

package kursovaya.java.core.exception;

public class NullCollectionException extends RuntimeException {

    public NullCollectionException() {
    }

    public NullCollectionException(String message) {
        super(message);
    }

    public NullCollectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullCollectionException(Throwable cause) {
        super(cause);
    }
}

package kursovaya.java.core.exception;

public class ParameterIsNullException extends RuntimeException {
    public ParameterIsNullException(String s) {

    }

    public ParameterIsNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParameterIsNullException(Throwable cause) {
        super(cause);
    }

    public ParameterIsNullException() {
    }
}
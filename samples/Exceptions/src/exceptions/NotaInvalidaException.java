package exceptions;

public class NotaInvalidaException extends RuntimeException {

    public NotaInvalidaException() {
        super("Nota fora do intervalo");
    }

    public NotaInvalidaException(String message) {
        super(message);
    }

    public NotaInvalidaException(Throwable cause) {
        super(cause);
    }

    public NotaInvalidaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NotaInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
}

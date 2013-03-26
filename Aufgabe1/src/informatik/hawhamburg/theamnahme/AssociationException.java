package informatik.hawhamburg.theamnahme;

/**
 * Exception used in Association implementations
 */
public class AssociationException extends Exception {
    public AssociationException(String message) {
        super(message);
    }

    public AssociationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AssociationException(Throwable cause) {
        super(cause);
    }

    public AssociationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

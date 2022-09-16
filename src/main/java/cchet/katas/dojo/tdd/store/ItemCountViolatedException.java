package cchet.katas.dojo.tdd.store;

public class ItemCountViolatedException extends RuntimeException {

    public ItemCountViolatedException() {
        super();
    }

    public ItemCountViolatedException(String message) {
        super(message);
    }

    public ItemCountViolatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemCountViolatedException(Throwable cause) {
        super(cause);
    }

    protected ItemCountViolatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

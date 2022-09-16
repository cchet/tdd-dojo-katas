package cchet.katas.dojo.tdd.store;

public class ItemQuantityViolatedException extends RuntimeException {

    public ItemQuantityViolatedException() {
        super();
    }

    public ItemQuantityViolatedException(String message) {
        super(message);
    }

    public ItemQuantityViolatedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemQuantityViolatedException(Throwable cause) {
        super(cause);
    }

    protected ItemQuantityViolatedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

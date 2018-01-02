package exceptions;

/**
 *
 * @author Bloch
 */
public class AmountIsNegativeException extends RuntimeException {

    /**
     * Creates a new instance of <code>AmountIsNegativeException</code> without
     * detail message.
     */
    public AmountIsNegativeException()
    {
    }

    /**
     * Constructs an instance of <code>AmountIsNegativeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AmountIsNegativeException(String msg)
    {
        super(msg);
    }
}

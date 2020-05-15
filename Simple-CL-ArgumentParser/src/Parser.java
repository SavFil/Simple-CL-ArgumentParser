import java.util.NoSuchElementException;

/**
 * This class parses end-user's input and provides functionality based on it.
 */
public class Parser extends Exception {

    private static final long serialVersionUID = 1L;

    public Parser() {
    }

    /**
     * 
     * @param options The list of arguments provided by the library's user
     * @param args The args passed by the end-user
     * @return Returns the argument if it is found
     * @throws NoSuchElementException Throws exception if the argument isn't found
     */
    public Argument parse(ArgumentList options, String[] args) throws NoSuchElementException {
        Argument temp = options.search(args[0]);
        if (temp != null)
            return temp;

        throw new NoSuchElementException();

    }

}
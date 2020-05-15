import java.util.ArrayList;

/**
 * This class provides storage and utility functions for objects of type
 * Argument
 */
public class ArgumentList extends ArrayList<Argument> {
    private static final long serialVersionUID = 1L;

    public ArgumentList() {
    }

    @Override
    /**
     * This method adds a new Argument object in the list, only if its aliases are unique
     * 
     * @param e The argument object to add
     * @return Returns true if the addition is succesful
     */
    public boolean add(Argument e) {
        if (this.contains(e))
            return false;

        return super.add(e);
    }

    /**
     * List all the arguments to the console
     */
    public void show() {
        for (Argument e : this) {
            System.out.println(e);
        }
    }

    /**
     * Checks wether the passed argument is already contained in the list
     * @param newArg the argument to check against
     * @return returns true is the argument already exists in the list
     */
    public boolean contains(Argument newArg) {
        for (Argument a : this) {
            if (a.isEqual(newArg))
                return true;
        }

        return false;
    }

    /**
     * This method is for arguments provided by the end-user
     * @param str The string the user supplied in the CLI as an argument
     * @return Returns the argument if it is found
     */
    public Argument search(String str) {
        for (Argument a : this) {
            if (a.getSign().containsKey(str))
                return a;
        }

        return null;
    }
}

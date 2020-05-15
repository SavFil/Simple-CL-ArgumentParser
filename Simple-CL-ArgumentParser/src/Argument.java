import java.util.HashMap;
import java.util.Map;

/**
 * This class contains the basic characteristics of a CLI argument
 */
public class Argument {

    private Character letter;
    private String word;
    private String description;
    private Boolean required;
    private Map<String, String> sign;

    /**
     * Argument constructor
     * @param letter One character alias for the argument
     * @param word Alias of the argument
     * @param description A description of whats this argument does
     * @param required Specifies if this argument is required
     */
    public Argument(Character letter, String word, String description, Boolean required) {
        this.letter = letter;
        this.word = word;
        this.description = description;
        this.required = required;
        this.sign = new HashMap<String, String>();
        sign.put(letter.toString(), word);
        sign.put(word, word);
    }

    public Argument() {
    }

    
    /** 
     * @return Map<String, String>
     */
    public Map<String,String> getSign() {
        return this.sign;
    }

    
    /** 
     * @return Character
     */
    public Character getLetter() {
        return this.letter;
    }

    
    /** 
     * @param letter
     */
    public void setLetter(Character letter) {
        this.letter = letter;
    }

    
    /** 
     * @return String
     */
    public String getWord() {
        return this.word;
    }

    
    /** 
     * @param word
     */
    public void setWord(String word) {
        this.word = word;
    }

    
    /** 
     * @return String
     */
    public String getDescription() {
        return this.description;
    }

    
    /** 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    /** 
     * @return Boolean
     */
    public Boolean isRequired() {
        return this.required;
    }

    
    /** 
     * @return Boolean
     */
    public Boolean getRequired() {
        return this.required;
    }

    
    /** 
     * @param required
     */
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * Checks if two arguments are equal.
     * @param arg The argument to check against to
     * @return  Returns true if the arguments are equal
     */
    public boolean isEqual(Argument arg) {
        if (this.getLetter().equals(arg.getLetter()) || this.getWord().equals(arg.getWord()))
            return true;

        return false;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" + " letter='" + letter + "'" + ", word='" + word + "'" + ", description='" + description + "'"
                + ", required='" + required + "'" + "}";
    }

}
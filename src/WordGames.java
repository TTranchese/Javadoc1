/**
 * Class that creates WordGames objects and implements 2 methods
 */
public class WordGames {
	/**
	 * Method that returns the concatenation of a string plus the word "word" before
	 * @param word
	 * @return
	 */
	public String addHelloWord(String word){
		return "Hello\s"+word;
	}

	/**
	 * Method that  returns the concatenation of 2 strings
	 * @param name
	 * @param surname
	 * @return
	 */
	public String getFullName(String name, String surname){
		return name+"\s"+surname;
	}

	/**
	 * Constructor for the  class
	 */
	public WordGames() {}
}

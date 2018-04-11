/**
 * A menu which handles menu selection
 * @author user
 *@see {@link InvalidOptionException}
 */
public class Menu {
	/**
	 * Display a selected menu option.
	 * @param opt the option selected.
	 * @throws InvalidOptionException if the given option is out of the valid range.
	 */
	void displayMenuOption(int opt) throws InvalidOptionException {
		if (opt < 1 || opt > 3)
			throw new InvalidOptionException ("The option must be between 1 and 3");
		System.out.println("Menu option " + opt + " selected");
		
	}

}

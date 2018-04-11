/**
 * Provides sentence counting operations.
 */

/**
 * @author user
 *
 */
public interface Counter {
	/**
	 * Returns the number of words in the sentence.
	 * 
	 *@param sentence the sentence from which to count the words.
	 * @return the number of words in the sentence.
	 */
	int countWords(String sentence);
	/**
	 * Returns the number of letters in the sentence
	 * the sentence from which to count the letters.
	 * Return the number of letters in the sentence
	 */
	int countLetters(String sentence);
	
	/**
	 * Gets the length of a sentence.
	 * 
	 * @param sentence the sentence for which the length is required.
	 * @return the length of a sentence.
	 */
	int getLength(String sentence);

}

/**
 * WordProcessor which implements the {@link Counter} interface
 * @author user
 *
 */
public class WordProcessor implements Counter {
	/**
	 * Holds the sentence to be analysed in the absence of a valid string being passed to the methods.
	 * 
	 */
	private String text = "";
	
	/**
	 * Gets the sentence to be analysed in the absence of a valid string being passed to the methods.
	 * 
	 * @return the sentence to be analysed in the absence of a valid string being passed to the methods.
	 */
	String getText() {
		return text;
	}
	
	/**
	 * Sets the sentence to be analysed in the absence of a valid string being passed to the methods.
	 * 
	 * @param text the sentence to be analysed in the absence of a valid string being passed to the methods.
	 * 
	 */
	void setText(String text){
		this.text = text;
	}
	
	@Override
	public int countWords(String sentence) {
		
		if(sentence == null ) // use 'text' if null sentence given.
			sentence = text;
		//simple way to count words, may not be completely.
		return sentence.split(" ").length;
			
	}
	public int countLetters(String sentence) {
		if (sentence == null ) // use 'text' if null sentence given.
			sentence = text;
		
		int letters = 0;
		//iterate over each character in the sentence, and decide whether it is a letter or not.
		
		for(int i=0; i < sentence.length(); i++) {
			if (Character.isLetter(sentence.charAt(i)))
				letters++;
		}
		
		return letters;
	}
	public int getLength(String sentence) {
		if(sentence == null) // use 'text' if null sentence is given.
		sentence = text;
		return sentence.length();
	}
	

}

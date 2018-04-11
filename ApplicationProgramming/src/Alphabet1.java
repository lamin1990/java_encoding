
public class Alphabet1 {

	public static void main(String[] args) {
		
		// 1. Write the shortest possible program that outputs the numbers between 0 and 100 to the console. hint: use a loop.
		for(int i=1; i < 100; i++)
			System.out.println(i);	
		
		// 2. Write the shortest possible program that outputs all the lower case letters of the alphabet to the console. hint: use a loop with a 'char' type variable.
		for(char c='a'; c <= 'z'; c++)
			System.out.println(c);
	
		// 3. Write the shortest possible program that outputs all the upper case letters of the alphabet, in reverse order, to the console. 
		for(char c='Z'; c >= 'A'; c--)
			System.out.println(c);
		
	}

}

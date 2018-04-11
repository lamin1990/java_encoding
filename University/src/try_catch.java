import java.util.*;
import java.io.*;


public class try_catch {
	public static void main(String[] args) { 
		int number;
		String word;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number now");
		try
		{
			number = scan.nextInt();
			System.out.println("Number entered is " + number);
		}
			catch (InputMismatchException e)
		{
		System.out.println("Mismatched input, Exception was caught, the program will exit.*");
			//e.printStackTrace();
				
			}
			
		//capture blank space due to enter
		scan.nextLine();
		
			System.out.println("Enter a word now");
		word = scan.nextLine();
		System.out.println("word entered is " + word);
		scan.close();
		}
	
		
	}
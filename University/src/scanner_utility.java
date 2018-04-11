import java.util.Scanner;

public class scanner_utility {
	public static void main(String[] args){
		//declare variables
		int value1, value2;
		
		//declare scanner
		Scanner scan = new Scanner(System.in);
		
		//Prompt the user, read in the int values of value1 and value2 from the keys
		//Display the value keyed in
		System.out.println("Key in Value 1 now");
		value1 = scan.nextInt();
		System.out.println("Value 1 is " + value1);
		
		System.out.println("Key in value 2 now ");
		value2 = scan.nextInt();
		System.out.println("Value 2 " + value2);
		
		//Calculate the average of the number inputs
		float average = (float)(value1 + value2)/2;
		System.out.println("Average is " + average);
		
		scan.close();
			
	}
}

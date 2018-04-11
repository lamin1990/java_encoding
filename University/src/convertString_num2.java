import java.util.Scanner;

public class convertString_num2 {
	public static void main(String[] args){
		//declare variables
		String num_string;
		int total1;
		double total2;
		float total3;
		
		//assign values to variables
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number now ");
		
		num_string = scan.nextLine();
		total1 = Integer.parseInt(num_string) + 10;
		total2 = Double.parseDouble(num_string) + 10;
		total3 = Float.parseFloat(num_string) + 10;
		
		//Display
		System.out.println("Total 1 is " + total1);
		System.out.println("Total 2 is " + total2);
		System.out.println("Total 3 is " + total3);
		
		scan.close();
		
	}
}

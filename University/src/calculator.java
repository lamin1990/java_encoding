import java.util.Scanner;
public class calculator {
	public static void main(String args[]) {
		Scanner cal = new Scanner(System.in);
		System.out.println("Enter first number:");
		Double num1;
		num1 = cal.nextDouble();
		
		System.out.println("Enter the second number:");
		
		Double num2;
		num2 = cal.nextDouble();
		
		
		Double total;
		total = num1 + num2;
		System.out.println("Total " + total);
		
	}

}

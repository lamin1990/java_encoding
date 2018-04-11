import java.util.Scanner;
public class SampleTest {
	public static void main(String [] args) {
		double total;
		double percentage;
		double discount;
		
		Scanner type = new Scanner(System.in);
		
		System.out.println("Enter in you percentage number");
		percentage = type.nextDouble();
		
		System.out.println("Enter in you total amount");
		
		total = type.nextDouble();
		
		
		
		discount = percentage/100 * total;
		
		System.out.println("Thats your discount: " + discount );
		
		
		
		
	}

}

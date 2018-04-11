import java.util.Scanner;
public class MathsExample 
{
	public static void main(String[] args)
	{
		int A, B, X;	//	AX^2 + BX
		double total;
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the X value: ");
		X = scan.nextInt();
		
		System.out.print("Enter the A value: ");
		A = scan.nextInt();
		
		System.out.print ("Enter the B value ");
		B = scan.nextInt();
		
		total = A* (Math.pow (X,2)) + B*X;
		System.out.println ("AX^2 + BX : " + total);
		scan.close();
		
	}

}

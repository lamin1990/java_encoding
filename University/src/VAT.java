import java.util.Scanner;

//********************************************************************
//  VAT.java 
//
//  Sample solution for VAT question.
//********************************************************************

public class VAT {

	public static void main(String[] args) 
	{
	
		float price, vatrate, totalvalue;
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.print("Please enter price:");
		
		price = keyboard.nextFloat();
		
		
       System.out.print("Please enter VAT rate: ");
		
       vatrate = keyboard.nextFloat();
       
       totalvalue = price +(price*vatrate)/100;
       
       System.out.print("Total amount due is: £" + totalvalue);
		
	

	}

}



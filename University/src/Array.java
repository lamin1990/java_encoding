
public class Array {
	public static void main(String[] args){
		
		
		//int [] numlist2 = new int [10];
		int[]numlist1 = {5,6,2,3,7,9,1,0};
		//print of the entire array
		for ( int value : numlist1){
			System.out.print("value is " + value + ";");
			
		}
		System.out.println("\n" + "The array contained " + numlist1.length + " elements. ");
		
		for ( int i = 0; i < numlist1.length; i++ ){
			System.out.println("Element " + (i+1) +  " was : "+ numlist1 [i]);
		}
	}

}


public class array_dynamic {
	public static void main(String[] args){
		
		final int limit = 20, increment = 50;
		int [] list = new int[limit];
		
		//initialise the array values
		for (int index = 0; index < limit; index ++){
			list [index] = index + increment;
		}
		//change item 10
		list[9] = 999;
		
		//print the array values
		for (int value : list) {
			System.out.println("value is " + " " + value + ";");
		}
			
	}

}

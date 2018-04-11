import java.util.Scanner;
public class store_array_data {
	public static void main(String[] args){
		//declare and initialise variables
		String [] product_list = new String[999];
		int counter = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your item: Country of origin: unit cost: total cost");
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.equals("quit")){
				break;
				
			} else {
				product_list[counter] = line;
			}
			counter++;
		}
		
		for (int i = 0; i < counter; i++ ){
			String [] elements = product_list[i].split(":");
			
			for (int j = 0; j < elements.length; j++ ){
				System.out.println("element: " + (j + 1) + " , " + elements[j] + "");
			}
			
			System.out.println(" ");
		}
	}

}

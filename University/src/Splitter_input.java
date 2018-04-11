import java.util.Scanner;

public class Splitter_input {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println("The input is " + line);
			
			if (line.equals("quit")){
				break;
			}
			else {
				String [] elements = line.split(":");
				
				for ( int i = 0; i < elements.length; i++ ) {
					System.out.println("Element " + (i+1) + " was : " + elements[i]);
					
					
				}
			}
		}
	}
}

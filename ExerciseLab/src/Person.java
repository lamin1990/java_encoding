
public class Person {
	
	static String name;
	static String address;
	static int age;
	
		public static void main(String[] args) {

			// 1. Add some attributes to the Person class that store appropriate data about a person.
			// 2. Add some methods that allow the attribute values to be set.
			// 3. Add another method called displayDetails() that outputs all the personal details stored about a person.
			// 4. Within this main() method, create a new instance of the Person class (called 'p1')
			// 5. Call each of the available set methods on the 'p1' instance.
			// 6. Call the displayDetails() method to confirm the set methods have worked correctly.

			// Extra. Create a Scanner object, and prompt the user for each detail of a person. Use the input data to setup a person object then display the details.
			
			Person p1 = new Person();
			
			
			
			setValues();
			displayDetails();
		}
		
		public static void setValues() {
			name = "lamin";
			address = "9 cromwell mount";
			age = 20;
		}
		
		
		public static void displayDetails() {
			
			
			System.out.println(name);
			
			
		
		}
		

	}



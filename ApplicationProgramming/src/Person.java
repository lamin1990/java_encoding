import java.util.Scanner;

public class Person {


	String name;
	
	String addr;
	
	String phone;
	
	String email;
	
	/**
	 * @param name the name to set
	 */
	public void setName(String n) {
		name = n;
	}


	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	void displayDetails() {
		
		System.out.println("Name     : " + name);
		System.out.println("Address  : " + addr);
		System.out.println("Phone No.: " + phone);
		System.out.println("Email    : " + email);
	}
	
	public static void main(String[] args) {

		// 1. Add some attributes to the Person class that store appropriate data about a person.
		// 2. Add some methods that allow the attribute values to be set.
		// 3. Add another method called displayDetails() that outputs all the personal details stored about a person.
		// 4. Within this main() method, create a new instance of the Person class (called 'p1')
		// 5. Call each of the available set methods on the 'p1' instance.
		// 6. Call the displayDetails() method to confirm the set methods have worked correctly.

		Person p1 = new Person();
		
		p1.setName("Mark");
		p1.setAddr("CAE118");
		p1.setPhone("0113 8126150");
		p1.setEmail("m.dixon@leedsbeckett.ac.uk");
		
		p1.displayDetails();
		
		// Extra. Create a Scanner object, and prompt the user for each detail of a person. Use the input data to setup a person object then display the details.
		Scanner s = new Scanner(System.in);
		
		Person p2 = new Person();
		
		System.out.print("Enter name : ");
		p2.setName(s.nextLine());
		
		System.out.print("Enter addr : ");
		p2.setAddr(s.nextLine());
		
		System.out.print("Enter phone no : ");
		p2.setPhone(s.nextLine());
		
		System.out.print("Enter email : ");
		p2.setEmail(s.nextLine());
		
		p2.displayDetails();
		
		s.close();
	}

}

import java.util.Scanner;
public class Student {
	
	String name;
	String addr;
	int age;
	String phone;
	String email;
	
	public void setName(String n) 
	{
		name = n;	
	}
	
	public void setAddr(String a) 
	{
		addr = a;
	}
	
	public void setPhone(String p) 
	{
		phone = p;
	}
	public void setemail(String e) 
	{
		email = e;
	}
	
	void displayDetails() 
	{
		System.out.println(name);
		System.out.println(addr);
		System.out.println(age);
		System.out.println(email);
	}
	
	public static void main(String[] args) 
	{
		
		Person p1 = new Person();
		
		p1.setName("lamin");
		p1.setAddr("9 cromwell");
		p1.setEmail("laminkhan2006@hotmail.com");
		p1.setPhone("0703618199");
		
		p1.displayDetails();
		
		Person p2 = new Person();
		
		Scanner k = new Scanner(System.in);
		System.out.println("Enter name:");
		p2.setName(k.nextLine());
		System.out.println("Enter addr");
		p2.setAddr(k.nextLine());
		System.out.println("Enter phone");
		p2.setPhone(k.nextLine());
		System.out.println("Enter Email");
		p2.setEmail(k.nextLine());
		
		k.close();
	}

}

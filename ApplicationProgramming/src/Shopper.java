
public class Shopper 
{
	
	public static void main(String[] args) 
	{
		Customer cus1 = new Customer();
		
		cus1.setCustomerid("c22941");
		cus1.setCustomerName("lamin");
		cus1.setCustomerNumber("07703618199");
		cus1.setCustomerAge(20);
		
		System.out.println("Customerid is : " + cus1.getCustomer_id());
		System.out.println("Customer name is: " + cus1.getCustomerName());
		System.out.println("Customer phone is: " + cus1.getCustomerNumber());
		System.out.println("Customer age is: " + cus1.getCustomerAge());
		
		
		
	}

}

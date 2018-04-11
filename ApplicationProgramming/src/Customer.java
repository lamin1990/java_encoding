
public class Customer {
	
	String customer_id;
	String customerName;
	int customerAge;
	String customerNumber;
	
	public void setCustomerid(String i) 
	{
		customer_id = i;
		
	}
	
	public void setCustomerName(String n) 
	{
		customerName = n;
	}
	
	public void setCustomerAge(int a) 
	{
		customerAge = a;
	}
	public void setCustomerNumber(String p) 
	{
		customerNumber = p;
	}
	
	public String getCustomer_id() 
	{
		return(customer_id);
	}
	public String getCustomerName() 
	{
		return(customerName);
	}
	public int getCustomerAge() 
	{
		return(customerAge);
	}
	public String getCustomerNumber() 
	{
		return(customerNumber);
	}

}

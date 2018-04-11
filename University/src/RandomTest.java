import java.util.Random;
public class RandomTest 
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		int num1;
		float num2;
		
		num1 = generator.nextInt(20);
		System.out.println("A random integar: " + num1);
		num1 = generator.nextInt(6);
		System.out.println("from 0 to 9: " + num1);

}
}
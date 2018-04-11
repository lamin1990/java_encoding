
public class MysnakeEyes {
	public static void main(String[] args) {
		
		   //-----------------------------------------------------------------
		   //  Creates two Die objects and rolls them several times, counting
		   //  the number of snake eyes that occur.
		   //-----------------------------------------------------------------
		
		final int ROLLS = 500;
		int num1, num2, num3 = 0, count = 0;
		
		MyDie d1 = new MyDie();
		MyDie d2 = new MyDie();
		MyDie d3 = new MyDie();
		
		for (int roll=1; roll <= ROLLS; roll++) 
		{
			
			num1 = d1.roll();
			num2 = d2.roll();
			num3 = d3.roll();
			
			if (num1 == 1 && num2 == 1 )
				count++;
			
		}
		
		System.out.println(ROLLS);
		System.out.println(count);
		System.out.println((float)count / ROLLS);
		System.out.println(num3);
	}

}

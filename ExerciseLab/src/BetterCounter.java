
public class BetterCounter {
	private int value = 1;
	
	public void setVal(int v) {
		value = v;
		
	}
	public int getVal() {
		return value;
	}
	public BetterCounter(int v) {
		value = v;
	}
	
	public static void main(String args []) {
		BetterCounter c1 = new BetterCounter(10);
		BetterCounter c2 = new BetterCounter(99);
		
		
		
		
		
		
		
		
		
		System.out.println("c2 count is " + c2.value);
	}

}

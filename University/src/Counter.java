
class Counter {
	int value = 1;
	
	
	void setVal(int v) {
		value = v;
	}
	int getVal() {
		return value;
	}
	public static void main(String args []) {
		Counter s1 = new Counter();
		s1.setVal(10);
		System.out.println("s1 count value is " + s1.getVal());
	}
	

}
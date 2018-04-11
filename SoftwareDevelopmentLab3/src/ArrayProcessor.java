/**
 * ArrayProcessor provides array manipulation methods
 * @author user
 *
 */
public class ArrayProcessor {
	/**
	 * Gets the length of the given array.
	 * @param a the array for which the length is required.
	 * @return the length of the array.
	 */
	public int getArrayLength(Object[] a) {
	
		int count = 0;
		try {
			while (true) {
				@SuppressWarnings("unused")
				Object t = a[count];
				
				count++;
			}
		}catch (Exception e) {
			//do nothing, used to find end of the array (bad idea in practice).
		}
		return count;
	}
		


}


/**
 * Shows how to parse a list of decimal values.
 * 
 * @author mdixon
 */
public class ListParser {


	public final static void main(String [] args) {

		// The sample list of values to be parsed. Normally these would come from somewhere else, e.g. read from a file.
		String sampleList = "10.2, 20.7, 0.001, 90.2, 100.1";

		// A sample list of invalid values, for testing. Change line below to use this variable instead and see the output.
		String errorList = "10a.0, xyz, 100.2";
		
		// Split the original string in to an array of strings (i.e. separate the values).
		String [] values = sampleList.split(",");

		// create an array to store the converted values. The size of the array is based on the element count of the 'values' array.
		double [] decimalVals = new double[values.length];
		
		try {
			// Iterate over each individual value, using a for loop
			for (int i =0; i < values.length; i++ ) {

				// get the next value to be converted
				String nextVal = values[i];

				// convert to a double and store in results array
				decimalVals[i] = Double.parseDouble(nextVal);
			}

			
			// All values now converted, so iterate over these and output them to confirm the values are okay.
			for (int i =0; i < decimalVals.length; i++ ) {
			
				System.out.println("Converted : " + decimalVals[i]);
			}
			
		}
		catch(NumberFormatException e) {
			// found a value which cannot be converted to a valid double value.
			System.err.println("The list contains a value that cannot be converted to a decimal value.");
		}
	}

}

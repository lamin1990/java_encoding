import java.text.DecimalFormat;

public class decimal_format {
	public static void main(String[] args){
		//At least 1 digit to the left and 0 if less than 1, rounded up to 3 decimal places
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println(fmt.format(0.2249999));
		System.out.println(fmt.format(1345.5678));
		System.out.println(fmt.format(1234.9999));
		
	}

}

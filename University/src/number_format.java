
import java.text.NumberFormat;
import java.util.Locale;

public class number_format {

	public static void main(String[] args){
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println(currency.format(123456));
		System.out.println(currency.format(5678));
		
		NumberFormat Jap_currency = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(Jap_currency.format(1234567));
		
		NumberFormat USA_currency = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(USA_currency.format(1234567));
		
		
	}
}

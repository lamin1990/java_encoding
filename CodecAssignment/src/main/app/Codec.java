package main.app;
/**
 * Codec which implements the {@link ICodec, IHasher} interface
 * @author user
 *
 */
public class Codec implements ICodec {
	
	
	private String SecretKey;
	
	public Codec(String secretKey) {
		this.SecretKey = secretKey;
	}
	
	/**
	 * Encodes the given string.
	 * 
	 * @param data the string to be encoded.
	 * @return the encoded version of the string.
	 */
	@Override
	public String Encode(String data) {
	
		// reverse the input chars 
		// append secret key
		
		// Secret key: 123
		// Input value: abcd
		// Output: dcba123 
		StringBuilder sb = new StringBuilder(data);
		sb.reverse().append(this.SecretKey);
		// -128 - 128
		// "abcd"
		// ['a', 'b', 'c', 'd']
		// [4, 5, 6, 7] => equation => [ 5, 4, 7, 13 ]
		//  [ 5, 4, 7, 13 ] => reverse equation =>  [4, 5, 6, 7]  
		
		/**
		 * get the individual bytes of the string (easier to manipulate).
		 */
		byte[] dataBytes = sb.toString().getBytes();
		
		/**
		 * create another byte array the same size (to store encoded version).
		 */
		byte [] outBytes = new byte[dataBytes.length];
		int secretRandomizer = this.SecretKey.length() * 2;
		
		/**
		 * Iterate over each byte of the string
		 */
		for (int i = 0; i < dataBytes.length; i++) {
			// index: multiple of 2 => add 1 
			// index: multiple of 3 => add twice the length of the secret
			// otherwise => subtract one
			if( i % 2 == 0) {
				outBytes[i] = (byte) (dataBytes[i] + 1);
			}
			else if( i % 3 == 0) {
				outBytes[i] = (byte) (dataBytes[i] + secretRandomizer);
			}
			else {
				outBytes[i] = (byte) (dataBytes[i] - 1);
			}
		}
		
		return new String(outBytes);
	}

	@Override
	public String Decode(String data) {
		// TODO Auto-generated method stub
		
		byte[] dataBytes = data.toString().getBytes();
		byte [] outBytes = new byte[dataBytes.length];
		
		int secretRandomizer = this.SecretKey.length() * 2;
		
		for (int i = 0; i < dataBytes.length; i++) {
			// index: multiple of 2 => substract 1 
			// index: multiple of 3 => remove twice the length of the secret
			// otherwise => add one
			if( i % 2 == 0) {
				outBytes[i] = (byte) (dataBytes[i] - 1);
			}
			else if( i % 3 == 0) {
				outBytes[i] = (byte) (dataBytes[i] - secretRandomizer);
			}
			else {
				outBytes[i] = (byte) (dataBytes[i] + 1);
			}
		}
		
		String obfuscatedValue = new String(outBytes).replace(this.SecretKey, "");
		StringBuilder sb = new StringBuilder(obfuscatedValue);
		sb.reverse();

		return sb.toString();
	}
}

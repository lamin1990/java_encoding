package MyEncodingLogic;
/**
 * Provides the encoding and decoding operations
 * @author user
 *
 */
public interface ICodec {
	/**
	 * Encode the given string
	 * @param data the string to be encoded
	 * @return the encoded version of the string
	 */
	String Encode(String data);
	
	/**
	 * Decode the given string
	 * @param data the string to be decoded
	 * @return the decoded version of the string
	 */
	String Decode(String data);
}

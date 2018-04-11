package MyEncodingLogic;
/**
 * Provides the hashing operation
 * @author user
 *
 */
public interface IHasher {
	/**
	 * Scramble or hash the given string
	 * @param data the string to be hash
	 * @return the hash version of the string
	 */
	String Hash(String data);
}

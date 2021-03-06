package MyEncodingLogic;

public class Hasher implements IHasher {

	@Override
	public String Hash(String data) {
		// TODO Auto-generated method stub
		long hash = 0;
		
		byte [] bytes = data.getBytes();
		
		// Iterate over each byte of the string, and use to calculate the hash
		for(int i = 0; i < bytes.length; i++) {
			byte b = bytes[i];
			// weight the position of each byte
			hash += ( (i + 1) * 10 ) + b * 13;
		}
		// abcd => 
		// 6593
		// 6 * 10 * 0 + 5 * 10 * 2 + 9 * 10 * 3 + .........
		// create a very simple hash (total of byte values, each multiplied by a prime number, all of which is multiplied by string size, then by another prime number)
		hash = hash * data.length() * 997;
		
		// make it slightly more obscure by applying a few xor operations to a shifted value.
		hash = hash ^ hash << 16;
		hash = hash ^ hash << 24;

		// Format the hash to use 16 chars (since this is the max size of a long)
		// 0-15: 10: A, 11: B, 
		// -2^32 - 2^32 -1
		return String.format("%016X", hash);
	}
}

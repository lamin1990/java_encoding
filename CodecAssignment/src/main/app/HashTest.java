package main.app;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author user
 *
 */
class HashTest {

	/**
	 * Test method for {@link Hasher#Hash(java.lang.String)}.
	 */
	@Test
	void testHash() {
		//fail("Not yet implemented");
		Hasher test = new Hasher();
		String mash = "My name is lamin";
		
		System.out.println(test.Hash(mash));
	}

}

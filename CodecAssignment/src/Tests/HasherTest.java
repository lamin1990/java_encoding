/**
 * 
 */
package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.app.Hasher;

/**
 * @author user
 *
 */
class HasherTest {
	Hasher tester;
	String data;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		tester = new Hasher();
		data = "test string";
	}

	/**
	 * Test method for {@link main.app.Hasher#Hash(java.lang.String)}.
	 */
	@Test
	void testHash() {
		//fail("Not yet implemented");
		assertEquals("24F5A7DB7CADFF89", tester.Hash(data));
	}

}

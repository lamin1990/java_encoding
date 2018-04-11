package main.app;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
//import static org.junit.jupiter.api.Assertions.*;



/**
 * 
 */

/**
 * @author user
 *
 */
class Test {

	/**
	 * Test method for {@link Codec#Codec(java.lang.String)}.
	 */
//	@org.junit.jupiter.api.Test
//	final void testCodec() {
//		fail("Not yet implemented"); // TODO
//	}


	/**
	 * Test method for {@link Codec#Encode(java.lang.String)}.
	 */
	@org.junit.jupiter.api.Test
	final void testEncode() {
		Codec test = new Codec("123456");
		String data = "My name is lamin";
		//fail("Not yet implemented"); // TODO
		System.out.println(test.Encode(data));
		//assertTrue(false);
		String expected = "ohnmmth!qn`ozY21436B";
		
		assertThat(expected, is(test.Encode(data)));
	}

	/**
	 * Test method for {@link Codec#Decode(java.lang.String)}.
	 */
	@org.junit.jupiter.api.Test
	final void testDecode() {
		Codec test = new Codec("123456");
		String data = "ohnmmth!qn`ozY21436B";
		//fail("Not yet implemented"); // TODO
		System.out.println(test.Decode(data));
		//assertTrue
		String expected = "My name is lamin";
		assertThat(expected, is(test.Decode(data)));
	}

}
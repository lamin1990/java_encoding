package test;
import MyEncodingLogic.Codec;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class EncodeTest {
	Codec test = new Codec("123456");
	
	@Test
	public void testEncode() {
		System.out.println(test.Encode("lami"));
		//assertTrue(false);
		String expected = "jlbx21436B";
		
		assertThat(expected, is(test.Encode("lami")));
		
	}

	
	
	
	@Test
	public void testDecode() {
		System.out.println(test.Decode("jlbx21436B"));
		//assertTrue
		String expected = "lami";
		assertThat(expected, is(test.Decode("jlbx21436B")));
		
		
	}

}
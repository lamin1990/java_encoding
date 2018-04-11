package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.app.*;

class CodecTest {

	private ICodec Codec;
	private final String CODEC_KEY = "123456";
	
	@BeforeEach
	void setUp() throws Exception {
		this.Codec = new Codec(CODEC_KEY);
	}

	@Test
	void testEncode() {
		//this.Codec.Encode("Test String");
		assertEquals("hmj~uR!stqU0325A7", this.Codec.Encode("Test String"));
	}

	@Test
	void testDecode() {
		assertEquals("Test String", this.Codec.Decode("hmj~uR!stqU0325A7"));
	}

}

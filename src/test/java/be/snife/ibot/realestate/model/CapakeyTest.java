package be.snife.ibot.realestate.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CapakeyTest {

	@Test
	void test() {
		Capakey capakey = new Capakey("11111", "A", "2222", "33", "B", "444",null);
		assertEquals("11111A2222/33B444", capakey.toString());
	}

}

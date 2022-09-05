package be.snife.ibot.realestate.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class RealEstateTest {

	@Test
	void test() {
		RealEstate re = RealEstateModelHelper.getRealEState1();
		log.debug(re.toString());		
	}

}

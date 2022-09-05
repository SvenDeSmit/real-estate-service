package be.snife.ibot.realestate.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import be.snife.ibot.realestate.model.RealEstate;
import be.snife.ibot.realestate.model.RealEstateModelHelper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class RealEstateDomainServiceTest {

	@Test
	void test() {
		RealEstate re = RealEstateModelHelper.getRealEState1();
		log.debug(re.toString());		
	}

}

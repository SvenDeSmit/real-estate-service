package be.snife.ibot.realestate.service;

import java.util.GregorianCalendar;
import java.util.Optional;

import org.springframework.stereotype.Service;

import be.snife.ibot.realestate.model.AbstractRealEstate;
import be.snife.ibot.realestate.model.CadasterAddress;
import be.snife.ibot.realestate.model.Capakey;
import be.snife.ibot.realestate.model.PatrimoniumParcel;
import be.snife.ibot.realestate.model.PlanParcel;
import be.snife.ibot.realestate.model.RealEstate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RealEstateDomainService implements RealEstateService {

	public Optional<AbstractRealEstate> getRealEstateById(String ID) {
		return Optional.of(getRealEState1());
	}
	
	public static RealEstate getRealEState1() {
		RealEstate re = new RealEstate();

		CadasterAddress addr = new CadasterAddress();
		addr.setZipCode("9160");
		addr.setCity("Lokeren");
		addr.setStreet("Lokerenstraat");
		addr.setNumber("111");
		addr.setNisCode("my-nis-code");
		
		PlanParcel plp = PlanParcel.builder()
				.capakey(new Capakey("11111", "A", "2222", "33", "B", "444",null))
				.build();
		
		PatrimoniumParcel pap = PatrimoniumParcel.builder()
				.creationDate(new GregorianCalendar(2010,9,5).getTime())
				.natureCode("nat-code-1").natureDescription("Nature description")
				.statuteCode("stat-code-1").statuteDescription("Statute description")
				.utilizationCode("util-code-1").utilizationDescription("Utilization description")
				.partNumber("P0001")
				.planParcel(plp)
				.build();
		pap.setAddress(addr);
		
		re.getComposition().add(pap);
		
		return re;

	}
	

}

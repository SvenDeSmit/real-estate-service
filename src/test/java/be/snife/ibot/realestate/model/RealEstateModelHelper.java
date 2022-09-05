package be.snife.ibot.realestate.model;

import java.util.GregorianCalendar;

public class RealEstateModelHelper {
	
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

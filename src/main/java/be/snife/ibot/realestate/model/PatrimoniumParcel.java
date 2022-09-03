package be.snife.ibot.realestate.model;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PatrimoniumParcel extends CadasterComponent {
	private PlanParcel planParcel;
	private String partNumber;
	
	private Date creationDate;
	
	private String natureCode; // Cadastrale aard 
	private String natureDescription;  
	private String statuteCode; // Cadastraal statuut 
	private String statuteDescription;  
	private String utilizationCode; // Cadastraal gebruik 
	private String utilizationDescription;  
	
	
	public String toString( ) {
		return planParcel.getCapakey().toString() + partNumber;
	}

}

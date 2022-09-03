package be.snife.ibot.realestate.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PlanParcel extends CadasterComponent { // Plan perceel https://overheid.vlaanderen.be/help/magda-online/magda-online-piloot/veelgestelde-vragen-faq/kadasterdiensten
	
	private Capakey capakey;
	private List<PatrimoniumParcel> patrimoniumParcels;
	
	// GEO stuff
	
	public String toString( ) {
		return capakey.toString();
	}

}

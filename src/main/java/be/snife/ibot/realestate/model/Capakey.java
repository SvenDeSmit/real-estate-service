package be.snife.ibot.realestate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Capakey {
	
	// 11111A2222/33B444
	
	private String cadastralDivision = "????"; // 11111
	private String section = "?"; // A
	private String primaryNumber = "????"; // 2222 (grondnummer)
	
	private String bisNumber = "??"; // 33	
	private String exponentLetter = "?"; // B
	private String exponentNumber = "???"; // 444
	
	private String preCadastralParcel;
	
	// private String franctionDenominator;
	
	public String toString( ) {
		return "" + cadastralDivision + section + primaryNumber + "/" + bisNumber + exponentLetter + exponentNumber;
	}
}

package be.snife.ibot.realestate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Address {

	private String nisCode;
	private String zipCode;
	private String city;
	private String street;
	private String number;
	private String box;

}

package be.snife.ibot.realestate.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class RealEstate extends Composite {

	public String toString() {
		ObjectMapper om = new ObjectMapper();
		String res = null;
		try {
			res = om.writeValueAsString(this);
		} catch(JsonProcessingException e) {
			log.error("Cannot create JSON from RealEstate object",e);
		}
		return res;
	}
}

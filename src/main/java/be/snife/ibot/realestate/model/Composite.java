package be.snife.ibot.realestate.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Composite extends AbstractRealEstate {
	private List<AbstractRealEstate> composition = new ArrayList<AbstractRealEstate>();
}

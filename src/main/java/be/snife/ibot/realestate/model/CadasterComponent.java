package be.snife.ibot.realestate.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class CadasterComponent extends Component {
	private CadasterAddress address;
}

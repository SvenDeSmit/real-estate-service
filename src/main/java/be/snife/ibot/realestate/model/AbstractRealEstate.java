package be.snife.ibot.realestate.model;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class AbstractRealEstate {
	private final UUID realEstateId = UUID.randomUUID();
	private final Date creationDate = Date.from(Instant.now());
}

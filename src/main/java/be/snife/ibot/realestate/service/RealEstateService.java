package be.snife.ibot.realestate.service;

import java.util.Optional;

import be.snife.ibot.realestate.model.AbstractRealEstate;

public interface RealEstateService {
	public Optional<AbstractRealEstate> getRealEstateById(String ID);
}

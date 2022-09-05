package be.snife.ibot.realestate.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.snife.ibot.realestate.model.AbstractRealEstate;
import be.snife.ibot.realestate.service.RealEstateDomainService;
import be.snife.ibot.realestate.service.RealEstateService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path="/api/realestate", produces = "application/json")
@Slf4j
public class RealEstateController {
	
	private RealEstateService svc;
	public RealEstateController(RealEstateService res) {
		svc = res;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AbstractRealEstate> getRealEstateByID(@PathVariable("id") String id) {
		Optional<AbstractRealEstate> re = svc.getRealEstateById(id);
		if(re.isPresent()) {
			return new ResponseEntity<>(re.get(),HttpStatus.OK);
		}
		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}

}

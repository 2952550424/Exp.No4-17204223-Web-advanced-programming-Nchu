package exp4.nchu17204223.petclinic.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import exp4.nchu17204223.petclinic.model.Vet;
import exp4.nchu17204223.petclinic.service.ClinicService;

@CrossOrigin
@RestController
@RequestMapping("api/v1/vets")
public class VetRestController {

	@Autowired
	private ClinicService clinicService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Vet>> vets(String lastName) {
		Collection<Vet> vets;
		if (lastName == null) {
			vets = clinicService.getAllVets();
		} else {
			vets = clinicService.findVetsByLastName(lastName);
		}
		return new ResponseEntity<Collection<Vet>>(vets, HttpStatus.OK);
	}
}

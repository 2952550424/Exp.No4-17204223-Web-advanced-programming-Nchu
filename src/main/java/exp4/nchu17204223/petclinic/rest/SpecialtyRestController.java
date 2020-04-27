package exp4.nchu17204223.petclinic.rest;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import exp4.nchu17204223.petclinic.model.Specialty;
import exp4.nchu17204223.petclinic.service.ClinicService;

@CrossOrigin
@RestController
@RequestMapping("api/v1/specialties")
public class SpecialtyRestController {
	
	@Autowired
	private ClinicService clientService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Specialty>> specialties() {
		Collection<Specialty> specialties = clientService.getAllSpecialties();
		return new ResponseEntity<Collection<Specialty>>(specialties, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Specialty> specialty(@PathVariable int id) {
		Optional<Specialty> specialty = clientService.findSpecialtyById(id);
		return new ResponseEntity<>(specialty.get(), HttpStatus.OK);
	}
}

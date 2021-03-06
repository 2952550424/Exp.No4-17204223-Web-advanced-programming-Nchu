package exp4.nchu17204223.petclinic.rest;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import exp4.nchu17204223.petclinic.error.PetClinicErrorMessage;
import exp4.nchu17204223.petclinic.error.PetClinicException;
import exp4.nchu17204223.petclinic.model.Owner;
import exp4.nchu17204223.petclinic.service.ClinicService;

@CrossOrigin
@RestController
@RequestMapping("api/v1/owners")
public class OwnerRestConrtoller {

	@Autowired
	private ClinicService clinicService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<Owner>> owners(String lastName) {
		Collection<Owner> owners;
		if (lastName == null) {
			owners = clinicService.getAllOwners();
		} else {
			owners = clinicService.findOwnersByLastName(lastName);
		}
		return new ResponseEntity<Collection<Owner>>(owners, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Owner> owners(@Valid @RequestBody Owner owner, BindingResult result) throws PetClinicException {
		if (result.hasErrors()) {
			throw new PetClinicException(new PetClinicErrorMessage(101, result.getFieldError("telephone").getDefaultMessage()));
		}
		owner = clinicService.addOwner(owner);
		return new ResponseEntity<>(owner, HttpStatus.CREATED);
	}
}

package exp4.nchu17204223.petclinic.service;

import java.util.Collection;
import java.util.Optional;

import exp4.nchu17204223.petclinic.model.Owner;
import exp4.nchu17204223.petclinic.model.Specialty;
import exp4.nchu17204223.petclinic.model.Vet;

public interface ClinicService {

	public Collection<Vet> getAllVets();
	public Collection<Vet> findVetsByLastName(String lastName);
	
	public Collection<Owner> getAllOwners();
	public Collection<Owner> findOwnersByLastName(String lastName);
	
	public Owner addOwner(Owner owner);
	
	public Collection<Specialty> getAllSpecialties();
	public Optional<Specialty> findSpecialtyById(int id);
}

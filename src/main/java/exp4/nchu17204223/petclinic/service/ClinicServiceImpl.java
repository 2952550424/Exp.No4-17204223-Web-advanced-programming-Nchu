package exp4.nchu17204223.petclinic.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exp4.nchu17204223.petclinic.model.Owner;
import exp4.nchu17204223.petclinic.model.Specialty;
import exp4.nchu17204223.petclinic.model.Vet;
import exp4.nchu17204223.petclinic.repository.OwnerRepository;
import exp4.nchu17204223.petclinic.repository.SpecialtyRepository;
import exp4.nchu17204223.petclinic.repository.VetRepository;

@Service
public class ClinicServiceImpl implements ClinicService {

	private VetRepository vetRepo;
	private OwnerRepository ownerRepo;
	private SpecialtyRepository specialtyRepo;
	
	@Autowired
	public ClinicServiceImpl(
			VetRepository vetRepo,
			OwnerRepository ownerRepo,
			SpecialtyRepository specialtyRepo) {
		this.vetRepo = vetRepo;
		this.ownerRepo = ownerRepo;
		this.specialtyRepo = specialtyRepo;
	}

	@Override
	public Collection<Vet> getAllVets() {
		return (Collection<Vet>) vetRepo.findAll();
	}

	@Override
	public Collection<Vet> findVetsByLastName(String lastName) {
		Collection<Vet> vets = vetRepo.findByLastName("%"+lastName+"%");
		return vets;
	}

	@Override
	public Collection<Owner> getAllOwners() {
		return (Collection<Owner>) ownerRepo.findAll();
	}

	@Override
	public Collection<Owner> findOwnersByLastName(String lastName) {
		Collection<Owner> owners = ownerRepo.findByLastName("%"+lastName+"%");
		return owners;
	}

	@Override
	public Owner addOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	@Override
	public Collection<Specialty> getAllSpecialties() {
		return (Collection<Specialty>) specialtyRepo.findAll();
	}
	
	@Override
	public Optional<Specialty> findSpecialtyById(int id) {
		return specialtyRepo.findById(id);
	}
}

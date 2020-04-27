package exp4.nchu17204223.petclinic.model;

import org.springframework.data.relational.core.mapping.Table;

@Table("vet_specialties")
public class Veterinarian {

	private int vet_id;
	private int specialty_id;

	public int getVet_id() {
		return vet_id;
	}

	public int getSpecialty_id() {
		return specialty_id;
	}
}

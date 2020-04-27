package exp4.nchu17204223.petclinic.model;

import java.util.Collection;

import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("vets")
public class Vet extends Person {
	
	@MappedCollection(idColumn = "vet_id", keyColumn = "vet_id")
	private Collection<Veterinarian> veterinarians;

	public Collection<Veterinarian> getVeterinarians() {
		return veterinarians;
	}
}

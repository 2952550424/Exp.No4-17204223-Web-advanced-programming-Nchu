package exp4.nchu17204223.petclinic.model;

import java.util.Collection;

import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("specialties")
public class Specialty extends NamedEntity {

	@MappedCollection(idColumn = "specialty_id", keyColumn = "specialty_id")
	private Collection<Veterinarian> veterinarians;

	public Collection<Veterinarian> getVeterinarians() {
		return veterinarians;
	}
}

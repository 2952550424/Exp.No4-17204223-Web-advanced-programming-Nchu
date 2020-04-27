package exp4.nchu17204223.petclinic.model;

import org.springframework.data.annotation.Id;

public class BaseEntity {

	@Id
	protected int id;

	public int getId() {
		return id;
	}
}

package exp4.nchu17204223.petclinic.model;

import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

@Table("pets")
public class Pet extends NamedEntity {

//	private Date brithDate;
//	private int typeId;
	
//	@Transient
//	private PetType type;
}

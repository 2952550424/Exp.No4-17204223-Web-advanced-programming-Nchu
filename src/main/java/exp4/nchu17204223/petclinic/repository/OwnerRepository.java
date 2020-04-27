package exp4.nchu17204223.petclinic.repository;

import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import exp4.nchu17204223.petclinic.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer>{

	@Query("select * from owners where last_name like :lastName")
	Collection<Owner> findByLastName(@Param("lastName") String lastName);
}

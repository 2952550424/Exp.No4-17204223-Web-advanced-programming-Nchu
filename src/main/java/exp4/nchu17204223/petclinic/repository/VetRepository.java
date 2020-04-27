package exp4.nchu17204223.petclinic.repository;

import java.util.Collection;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import exp4.nchu17204223.petclinic.model.Vet;

@Repository
public interface VetRepository extends CrudRepository<Vet, Integer> {

	@Query("select * from vets where last_name like :lastName")
	Collection<Vet> findByLastName(@Param("lastName") String lastName);
}

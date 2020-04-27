package exp4.nchu17204223.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import exp4.nchu17204223.petclinic.model.Specialty;

@Repository
public interface SpecialtyRepository extends CrudRepository<Specialty, Integer> {

}

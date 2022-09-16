package restusers.repository;

import org.springframework.data.repository.CrudRepository;
import restusers.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}

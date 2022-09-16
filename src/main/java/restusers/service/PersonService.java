package restusers.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import restusers.model.Person;
import restusers.repository.PersonRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class PersonService implements IPerson {

    private PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public Set<Person> findAll() {
        HashSet<Person> set = new HashSet<>();
        repo.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Person save(Person object) {
        Person person = (Person) object;
        return repo.save(object);
    }

    @Override
    public void delete(Person object) {
        repo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repo.deleteById(aLong);

    }

    @Override
    public void change(@PathVariable Long aLong) {



    }


    @Override
    public Optional<Person> findById(Long aLong) {
        return repo.findById(aLong);
    }


}

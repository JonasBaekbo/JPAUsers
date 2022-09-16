package restusers.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restusers.exception.ResourceNotFoundException;
import restusers.model.Person;
import restusers.service.PersonService;

import java.util.Set;

@RestController // returns JSON instead of entire webpage (using @Controller)
public class PersonController {
    private PersonService pService;

    public PersonController(PersonService pService) {
        this.pService = pService;
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<Set<Person>> getGreeting(){ // returns data as JSON
        pService.save(new Person());
        return new ResponseEntity<>(pService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Set<Person>> addPerson(Person name){ // returns data as JSON
        System.out.println("Received persons name " + name.getName());
        pService.save(name);
        return new ResponseEntity<>(pService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping ("/deleteUser")
    public ResponseEntity<Set<Person>> removePerson(Person name){ // returns data as JSON
        System.out.println("Deleted User " + name);
        pService.deleteById(name.getId());
        return new ResponseEntity<>(pService.findAll(), HttpStatus.OK);
    }

    @PutMapping("/editUser")
    public ResponseEntity<Set<Person>> updatePerson(Long id, Person name){
        Person updatePerson = pService.findById(id).orElseThrow(() -> new ResourceNotFoundException("No one exists with id: " + id));
        updatePerson.setName(name.getName());
        pService.save(updatePerson);
        System.out.println("edited user " + updatePerson.getName());
        return new ResponseEntity<>(pService.findAll(), HttpStatus.OK);
    }

}
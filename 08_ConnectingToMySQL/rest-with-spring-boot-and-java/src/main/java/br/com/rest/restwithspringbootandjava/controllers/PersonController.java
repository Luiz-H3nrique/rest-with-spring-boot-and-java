package br.com.rest.restwithspringbootandjava.controllers;


import br.com.rest.restwithspringbootandjava.model.Person;
import br.com.rest.restwithspringbootandjava.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServices services;

    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return  services.findByAll();
    }

    @GetMapping (value = "/{id}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById( @PathVariable(value = "id")  long id ){
        return  services.findById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create( @RequestBody Person person){
        return  services.create(person);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update( @RequestBody Person person){
        return  services.update(person);
    }

    @DeleteMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable(value = "id")  long id ){
        services.delete(id);
        return ResponseEntity.noContent().build();
    }
}

package br.com.rest.restwithspringbootandjava.services;

import br.com.rest.restwithspringbootandjava.exceptions.ResourceNotFoundException;
import br.com.rest.restwithspringbootandjava.model.Person;
import br.com.rest.restwithspringbootandjava.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

@Service
public class PersonServices {

   private Logger logger = Logger.getLogger(PersonServices.class.getName());

   @Autowired
    PersonRepository repository;

    public List<Person> findByAll(){
        logger.info("Finding All people !!!");
        return repository.findAll();
    }

    public Person findById(long id){
       logger.info("Finding one person !!!");


       return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No record found for this id"));
   }

    public Person create (Person person ){
        logger.info("Creating  one person !!!");

        return repository.save(person);
    }

    public Person update (Person person ){
        logger.info("Update  one person !!!");
        Person entity = repository.findById(person.getId()).orElseThrow(()-> new ResourceNotFoundException("No record found for this id"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAdress(person.getAdress());
        entity.setGender(person.getGender());


        return repository.save(entity);
    }
    public void delete (long id ){
        logger.info("Deleting  one person !!!");
        Person entity = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No record found for this id"));
        repository.delete(entity);

    }

}

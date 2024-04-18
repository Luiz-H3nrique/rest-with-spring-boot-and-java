package br.com.rest.restwithspringbootandjava.services;

import br.com.rest.restwithspringbootandjava.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
   private final AtomicLong counter = new AtomicLong();
   private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findByAll(){
        logger.info("Finding All people !!!");
        List<Person> persons = new ArrayList<>();

        for(int i = 0 ; i < 8 ; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    public Person findById(String id){
       logger.info("Finding one person !!!");

       Person person = new Person();
       person.setId(counter.incrementAndGet());
       person.setFirstName("Luiz");
       person.setLastName("Oliveira");
       person.setAdress("Cajamar - São Paulo - Brasil");
       person.setGender("Male");
       return person;
   }

    public Person create (Person person ){
        logger.info("Creating  one person !!!");

        return person;
    }

    public Person update (Person person ){
        logger.info("Update  one person !!!");

        return person;
    }
    public void delete (String id ){
        logger.info("Deleting  one person !!!");
    }

    private Person mockPerson (int i ){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last Name " + i);
        person.setAdress("Some Adress in Brasil");
        person.setGender("Male");
        return person;
    }
}

package br.com.rest.restwithspringbootandjava.repositories;

import br.com.rest.restwithspringbootandjava.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> { }

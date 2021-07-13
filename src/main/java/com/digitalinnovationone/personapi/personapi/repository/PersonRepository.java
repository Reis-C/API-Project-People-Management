package com.digitalinnovationone.personapi.personapi.repository;

import com.digitalinnovationone.personapi.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

package com.dio.PeopleAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.PeopleAPI.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
}

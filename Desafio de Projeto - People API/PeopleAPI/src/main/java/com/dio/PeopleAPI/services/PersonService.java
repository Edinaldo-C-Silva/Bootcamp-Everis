package com.dio.PeopleAPI.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.PeopleAPI.dto.mapper.PersonMapper;
import com.dio.PeopleAPI.dto.request.PersonDTO;
//import com.dio.PeopleAPI.dto.response.MessageResponseDTO;
import com.dio.PeopleAPI.entity.Person;
import com.dio.PeopleAPI.exception.PersonNotFoundException;
import com.dio.PeopleAPI.repository.PersonRepository;

//Indica pro spring que a classe vai ser responsável pelas regras de negócio da aplicação
@Service
public class PersonService {
	private PersonRepository pr;
	private final PersonMapper pm = PersonMapper.INSTANCE;
	
	@Autowired
	public PersonService(PersonRepository pr) {
		this.pr = pr;
	}
	
	public String createPerson(PersonDTO personDTO) {
		Person personSave = pm.toModel(personDTO);
		
		pr.save(personSave);
		// "builder" não funciona por algum motivo
		//Person savedPerson = pr.save(person);
		//return MessageResponseDTO.builder().message("Created person with ID " + savedPerson.getID()).build();
		return "Pessoa criada!";
	}

	public List<PersonDTO> listAll() {
		List<Person> allPeople = pr.findAll();
		return allPeople.stream().map(pm::toDTO).collect(Collectors.toList());
	}

	public PersonDTO findById(Long id) throws PersonNotFoundException{
		Optional<Person> optPerson = pr.findById(id);
		if (optPerson.isEmpty()) {
			throw new PersonNotFoundException(id);
		}
		return pm.toDTO(optPerson.get());
	}

	public void delete(Long id) throws PersonNotFoundException{
		Optional<Person> optPerson = pr.findById(id);
		if (optPerson.isEmpty()) {
			throw new PersonNotFoundException(id);
		}
		
		pr.deleteById(id);
	}

	public String updateById(Long id, PersonDTO pDTO) throws PersonNotFoundException {
		Optional<Person> optPerson = pr.findById(id);
		if (optPerson.isEmpty()) {
			throw new PersonNotFoundException(id);
		}
		
		Person personUpdate = pm.toModel(pDTO);
		
		pr.save(personUpdate);
		return "Pessoa atualizada!";
	}
	
}

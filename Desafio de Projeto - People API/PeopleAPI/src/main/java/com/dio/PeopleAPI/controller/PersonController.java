package com.dio.PeopleAPI.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dio.PeopleAPI.dto.request.PersonDTO;
import com.dio.PeopleAPI.exception.PersonNotFoundException;
import com.dio.PeopleAPI.services.PersonService;

// Vai ser acessado através de uma API Rest
@RestController
// Caminho de acesso principal
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonService ps;
	
	@Autowired
	public PersonController(PersonService ps) {
		this.ps = ps;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String createPerson(@RequestBody @Valid PersonDTO personDTO) {
		return ps.createPerson(personDTO);
	}
	
	@GetMapping
	public List<PersonDTO> listAll(){
		return ps.listAll();
	}
	
	@GetMapping("/{Id}")
	public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
		return ps.findById(id);
	}
    
	@DeleteMapping("/{Id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
		ps.delete(id);
	}
	
	@PutMapping("/{Id}")
	public String updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO pDTO) throws PersonNotFoundException {
		return ps.updateById(id, pDTO);
	}
}

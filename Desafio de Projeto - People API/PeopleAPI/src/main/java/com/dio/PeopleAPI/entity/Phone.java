package com.dio.PeopleAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dio.PeopleAPI.enums.PhoneType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Indica que é uma entidade do banco de dados
@Entity
// Insere um getter e setter
@Data
// Faz a construção de objetos
@Builder
// Inserem os construtores
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private PhoneType type;
	
	@Column(nullable = false, unique = true)
	private String number;
}

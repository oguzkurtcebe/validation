package com.oguzkurtcebe.organization.service;

import java.util.List;

import com.oguzkurtcebe.organization.model.Person;

public interface PersonService {

void createPerson(Person person);
void updatePerson(Person person);
void deletePerson(Long id);
Person findPerson(Long id);
List<Person>findPersons();
	
}

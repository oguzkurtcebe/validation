package com.oguzkurtcebe.organization.service;

import java.util.List;

import com.oguzkurtcebe.organization.dao.PersonRepository;
import com.oguzkurtcebe.organization.dao.jpa.PersonRepositoryJpaImpl;
import com.oguzkurtcebe.organization.model.Person;

public class PersonServiceImpl implements PersonService {
private PersonRepository personRepository=new PersonRepositoryJpaImpl();
	

	@Override
	public void createPerson(Person person) {
		personRepository.create(person);
		
	}


	@Override
	public void updatePerson(Person person) {
		personRepository.update(person);
		
	}


	@Override
	public void deletePerson(Long id) {
		personRepository.delete(id);
		
	}


	@Override
	public Person findPerson(Long id) {
		return personRepository.findById(id);
	}


	@Override
	public List<Person> findPersons() {
		return personRepository.getAll();
	}

}

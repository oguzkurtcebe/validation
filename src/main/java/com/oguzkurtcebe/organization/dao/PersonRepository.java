package com.oguzkurtcebe.organization.dao;

import java.util.List;

import com.oguzkurtcebe.organization.model.Person;

public interface PersonRepository {
	void create(Person person);

	Person update(Person person);

	void delete(Long id);

	Person findById(Long id);

	List<Person> getAll();

}

package com.oguzkurtcebe.organization.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.oguzkurtcebe.organization.dao.PersonRepository;
import com.oguzkurtcebe.organization.factory.JpaFactory;
import com.oguzkurtcebe.organization.factory.JpaFactoryImpl;
import com.oguzkurtcebe.organization.model.Person;

public class PersonRepositoryJpaImpl implements PersonRepository {

	private JpaFactory factory = new JpaFactoryImpl();
	EntityManager entityManager = factory.getEntityManager();
	EntityTransaction transaction = factory.getTransaction();

	@Override
	public void create(Person person) {
		transaction.begin();
		entityManager.persist(person);
		transaction.commit();
	}

	@Override
	public Person update(Person person) {
		transaction.begin();
		Person person2 = entityManager.merge(person);
		transaction.commit();
		return person2;
	}

	@Override
	public void delete(Long id) {
		transaction.begin();
		entityManager.remove(entityManager.getReference(Person.class, id));
		transaction.commit();

	}

	@Override
	public Person findById(Long id) {
		Person person = entityManager.find(Person.class, id);
		return person;
	}

	@Override
	public List<Person> getAll() {
		return entityManager.createQuery("from Person", Person.class).getResultList();
	
	}

}

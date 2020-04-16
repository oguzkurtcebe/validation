package com.oguzkurtcebe.organization.web;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.oguzkurtcebe.organization.model.Person;
import com.oguzkurtcebe.organization.service.PersonService;
import com.oguzkurtcebe.organization.service.PersonServiceImpl;

@Path("rest")
public class PersonRestController {

	PersonService personService = new PersonServiceImpl();

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("person")
	public Response createPerson(Person person) {

		personService.createPerson(person);
		return Response.ok().build();
	}

	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Path("person/{id}")
	public Response updatePerson(@PathParam("id") Long id, Person person) {
		personService.updatePerson(person);
		return Response.ok().build();
	}

	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("person/{id}")
	public Response deletePerson(@PathParam("id") Long id) {
		personService.deletePerson(id);
		return Response.ok().build();
	}

	@GET
	@Produces
	@Path("person/{id}")
	public Response getPerson(@PathParam("id") Long id) {
		Person person = personService.findPerson(id);
		return Response.ok(person).build();
	}

	@GET
	@Produces
	@Path("persons")
	public Response getPersons() {
		List<Person> list = personService.findPersons();
		return Response.ok(list).build();
	}

}
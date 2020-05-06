package com.demo.spring.batch;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	  private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

	  @Override
	  public Person process(final Person person) throws Exception {
	    final String firstName = person.getFirstName().toUpperCase();
	    final String lastName = person.getLastName().toUpperCase();
	    final Date dob = person.getDob();
	    
	    final Person transformedPerson = new Person(0, firstName, lastName, dob);

	    log.info("Converting (" + person + ") into (" + transformedPerson + ")");

	    return transformedPerson;
	  }

	}
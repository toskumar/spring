package com.demo.spring.batch;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Person {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private Date dob;
	
	public void setDob(String dob) throws Exception {
		this.dob = new SimpleDateFormat("yyyy-mm-dd").parse(dob);
	}
}

package com.tcs.TestHello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@Column(name = "ROLL")
	private int roll;
	@Column(name = "NAME")
	private String name;
	@Column(name = "CITY")
	private String city;

	public Student() {

	}

	public Student(int roll, String name, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

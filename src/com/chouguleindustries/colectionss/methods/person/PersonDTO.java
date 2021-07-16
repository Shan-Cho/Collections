package com.chouguleindustries.colectionss.methods.person;

import java.io.Serializable;

public class PersonDTO implements Serializable, Comparable<PersonDTO> {

	private String name;
	private int age;
	private String emailID;

	public PersonDTO() {
		System.out.println("default");
	}

	public PersonDTO(String name, int age, String emailID) {
		super();
		this.name = name;
		this.age = age;
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", emailID=" + emailID + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public int compareTo(PersonDTO other) {
		int ageOfOther = other.getAge();
		if (this.age == ageOfOther)
			return 0;
		if (this.age < ageOfOther)
			return -1;
		if (this.age > ageOfOther)
			return 1;
		return 0;
	}
}

package com.chouguleindustries.colectionss.methods.person;

import java.util.*;

public class PersonTester {

	public static void main(String[] args) {

		PersonDTO dto1 = new PersonDTO("Rakshitha", 32, "rakshitha3518@gmail.com");
		PersonDTO dto2 = new PersonDTO("Saurabh", 24, "saurabh007@gmail.com");
		PersonDTO dto3 = new PersonDTO("Rohan", 29, "rohan999@gmail.com");
		PersonDTO dto4 = new PersonDTO("Dhanya", 28, "dhanya@gmail.com");
		PersonDTO dto5 = new PersonDTO("Shantanu", 24, "shantanu@gmail.com");
		PersonDTO dto6 = new PersonDTO("Shyam", 94, "shyamsingh@gmail.com");

		List<PersonDTO> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);
		list.add(dto6);

		for (PersonDTO person : list) {
			System.out.println(person);

		}

		System.out.println("****");
		Collections.sort(list);

		for (PersonDTO person : list) {
			System.out.println(person);
		}
	}
}
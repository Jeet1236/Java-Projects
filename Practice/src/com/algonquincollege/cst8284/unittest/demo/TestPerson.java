package com.algonquincollege.cst8284.unittest.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPerson {

	@Test
	public void testGetFullName() {
	// set up the test
	Person person = new Person();
	person.setFirstName("first");
	person.setLastName("last");
	// expected value or result
	final String expectedFullName = "firstlast"; // note the space inside
	String actualFullName = person.getFullName();
	assertEquals("getFirstName() return value does not match expectations",
	expectedFullName, actualFullName);
	// tear down resources i.e. make avail for Garbage Collector
	person = null;
	}

}

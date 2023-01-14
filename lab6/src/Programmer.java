/*

*Student name: Jeet Patel
*Student number : 041060909
* Class: CST8284
* Professor: Fedor Ilitchev
* Date: November 20, 2022
*/
//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

public abstract class Programmer implements Payme {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

//three-argument constructor
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

// RETURNS THE FIRSTNAME
	String getFirstName() {
		return firstName;
	}

//RETURNS THE LASTNAME
	String getLastName() {
		return lastName;
	}

//RETURNS THE SOCIAL SECURITY NUMBER
	String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

//return String representation of Programmer object
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}

	public abstract double getPaymentAmount();
}

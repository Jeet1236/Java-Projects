/*

*Student name: Jeet Patel
*Student number : 041060909
* Class: CST8284
* Professor: Fedor Ilitchev
* Date: November 20, 2022
*/
//SalariedProgrammer concrete class extends abstract class Programmer.

public class SalariedProgrammer extends Programmer {
	private double weeklySalary;

//constructor
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

//set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	}

//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	}

//calculate earnings; override abstract method earnings in Programmer

	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

//return String representation of SalariedProgrammer object   
	@Override
	public String toString() {
		return String.format("salaried Programmer: %s %s\nSocial Security Number: %s \nweekly salary: %.2f",
				super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), getWeeklySalary());
	}

}

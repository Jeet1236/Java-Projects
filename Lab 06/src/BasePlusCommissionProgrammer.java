
/*

*Student name: Jeet Patel
*Student number : 041060909
* Class: CST8284
* Professor: Fedor Ilitchev
* Date: November 20, 2022
*/
//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

public class BasePlusCommissionProgrammer extends CommissionProgrammer {

	private double baseSalary; // base salary per week

//constructor
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

//set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;
	}

//return base salary
	public double getBaseSalary() {
		return baseSalary;
	}

//calculate earnings; override method earnings in CommissionProgrammer

	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	}

//return String representation of BasePlusCommissionProgrammer object
	@Override

	public String toString() {
		return String.format(
				"base-plus commission programmer: %s %s\nSocial Security Number: %s \nGross Sales : %.2f, commission rate: %.2f",
				super.getFirstName(), super.getLastName(), super.getSocialSecurityNumber(), super.getGrossSales(),
				super.getCommissionRate());
	}

}

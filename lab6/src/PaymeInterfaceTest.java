
/*

*Student name: Jeet Patel
*Student number : 041060909
* Class: CST8284
* Professor: Fedor Ilitchev
* Date: November 20, 2022
*/

//This is the test for interface Payme.

public class PaymeInterfaceTest {

	public static void main(String[] args) {

		// CREATING SIX-ELEMENTS Payme array HERE 

		Payme[] paymeObjects = new Payme[6];

		// CREATING OBJECTS FROM THE CLASSES OF
		// Invoice,SalariedProgrammer,HourlyProgrammer,CommissionProgrammer,BasePlusCommissionProgrammer
		Invoice invoice1 = new Invoice("22776", "brakes", 3, 300.00);
		Invoice invoice2 = new Invoice("33442", "gear", 5, 90.99);
		SalariedProgrammer salariedProgrammer = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320);
		HourlyProgrammer hourlyProgrammer = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40);
		CommissionProgrammer commissionProgrammer = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500,
				0.44);
		BasePlusCommissionProgrammer basePlusCommissionProgrammer = new BasePlusCommissionProgrammer("Esther", "Patel",
				"102-34-5888", 1200, 0.04, 720);

// ASSINGNING THE OBJECTS TO THE ARRAY
		paymeObjects[0] = invoice1;
		paymeObjects[1] = invoice2;
		paymeObjects[2] = salariedProgrammer;
		paymeObjects[3] = hourlyProgrammer;
		paymeObjects[4] = commissionProgrammer;
		paymeObjects[5] = basePlusCommissionProgrammer;

		System.out.println("Payment for Invoices and Programmers are processed polymorphically:\n");

// generically process each element in array paymeObjects

		for (Payme currentPayme : paymeObjects) {
// output currentPayme and its appropriate payment amount
			System.out.printf("%s ", currentPayme.toString());

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
// downcast Payme reference to
// BasePlusCommissioProgrammer reference
				BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
				System.out.printf("\nBase Salary:%.2f",programmer.getBaseSalary());
				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf("\nnew base salary with 10%% increase is: $%,.2f", programmer.getBaseSalary());
			}

// PRINTING THE PAYMENT DUE
			System.out.printf("\nPayment due: %.2f\n\n", currentPayme.getPaymentAmount());

		}
	}
}

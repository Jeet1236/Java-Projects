
/**
 * 
 * SalesSupervisor inherits from the SalesAgent. It prints the name,age and
 * location of the user.
 */
public class SalesSupervisor extends SalesAgent {
	/**This constructor calls the constructor of the parent class and sets the location of the object
	 * @param n        - name of the sales agent
	 * @param a        - age of the sales agent
	 * @param location
	 * 
	 */
	public SalesSupervisor(String n, int a, String location) {
		super(n, a);
		this.location = location;
	}

	String location;
	/**
	 * This portion of the code returns the string representation of the object.
	 * This method overrides the method of the parent class SalesAgent
	 * @return a string representation of the object
	 * @override
	 */
	public String toString() {

		return "SalesSupervisor [ super =  " + super.toString() + ", location=" + this.location + "]";
	}
}

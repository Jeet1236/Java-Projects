
/**
 * 
 * This class inherits from the SalesSupervisor class
 * This class print the name,age,and department of the user.
 *
 */
public class SalesChief extends SalesSupervisor {
	
	/**
	 * This constructor calls the constructor of the parent class and also sets the department name of the object
	 * @param n - name of the sales agent
	 * @param a - age of the sales agent
	 * @param location
	 * @param department- department of the sales agent
	 * */
	public SalesChief(String n, int a,String location,String department) {
		super(n, a,location);
		this.department = department;
		
	}

	public String department;
	
	/**
	 * This portion of the code returns the string representation of the object.
	 * This method overrides the method of the class SalesSupervisor
	 * @return a string representation of the object
	 * @override
	 */
	public String toString() {
		
		return "Sales Chief [Super = "+super.toString()+	",Department="+this.department+"]]";	
	}
}

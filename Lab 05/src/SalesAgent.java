
/**
 * This class shows a Sales Agent with a name and age.
 */
public class SalesAgent {
	private String name;
	private int age;

	/**
	 * It sets the name and age of the object based on the arguments entered
	 * @param n the name of the Sales Agent
	 * @param a the age of the Sales Agent
	 */

	public SalesAgent(String n, int a) {
		this.name = n;
		this.age = a;
	}

	/**
	 * This portion of the code returns the string representation of the object.
	 * 
	 * @return a string representation of the object
	 */

	public String toString() {
		return "Sales Agent [name=" + name + ",age=" + age + "]";
	}
}
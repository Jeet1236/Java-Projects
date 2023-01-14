


/**
 * This class takes the input and does various calculations on the input and display the health record of the patient
 * 
 * The constructor of this class takes all the entered input into parameters.
 * Then it sets the values of the variables.
 * Various methods calculate the BMI,age,maximum and minimum targeted heart rate.
 * Finally, displayMyHealthData displays all the health record of the patient.
 *
 *
 * <pre>Student name: Jeet Patel </pre> 
 * <pre>Student number : 041060909 </pre>
 * <pre>Class: CST8284</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Date: November 06, 2022</pre>
 * @author Jeet Patel
 * @version 11.0.15
 */

class MyHealthData {


	// Declaring all the variables here
	public String firstName;
	public String lastName;
	public String gender;
	public int birthYear;
	public int currentYear;
	public double height;
	public double weight;


	//Constructor takes all the inputs and give the variables the entered input
	public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, double height,
			double weight) {
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
		setBirthYear(birthYear);
		setCurrentYear(currentYear);
		setHeight(height);
		setWeight(weight);
	}

	// Overloading constructor
	public MyHealthData() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	/**
	 * @return age - This age is calculated on the basis of current year and the birth year 
	 */
	public int getAge() {
		return (getCurrentYear() - getBirthYear());
	}
	
	/**
	 * @return maximum heart rate  
	 */
	public int getMaximumHeartRate() {
		return (220 - getAge());
	}
	
	/**
	 * @return Minimum targeted heart rate - it is half of the maximum heart rate 
	 */
	public double getMinimumTargetHeartRate() {
		return (getMaximumHeartRate() / 2);
	}
	/**
	 * @return Maximum Targeted Heart Rate- it is 85 % of the maximum heart rate of the patient  
	 */
	public double getMaximumTargetHeartRate() {
		return (getMaximumHeartRate() * 17 / 20);
	}
	/**
	 * @return BMI
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	}

	// This method returns all the health record of the patient
	public void displayMyHealthData() {


		System.out.println("First Name:" + getFirstName());
		System.out.println("Last Name:" + getLastName());
		System.out.println("Gender:" + getGender());
		System.out.println("Year Of Birth:" + getBirthYear());
		System.out.println("Height:" + getHeight());
		System.out.println("Weight:" + getWeight());
		System.out.println("Age:" + getAge() + "\nBMI:" + getBMI() + "\nMaximum Heart Rate:" + getMaximumHeartRate()
				+ "\nMinimum Target Heart Range:" + getMinimumTargetHeartRate() + "\nMaximum Target Heart Range:"
				+ getMaximumTargetHeartRate());

		// Prints the meaning behind the values of BMI
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

} 

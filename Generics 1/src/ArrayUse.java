
public class ArrayUse {

	public static void main(String[] args) {
		Person[] people = new Person[10];
		people[0] = new Person("Fred", "Flintstone");
		people[1] = new Person("Barney", "Rubble");
		
		Pet fredPet = new Pet("Dino", "dinosaur");
		
		/* arrays are type-safe. Can't add a instance unless it is a compatible type
		 * next line will generate a compile error if it is not commented.
		 */
		
//		people[2] = fredPet;
	}//main()

}//class

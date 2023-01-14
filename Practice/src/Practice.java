

class Practice{
	
	public static void main(String[] args) {
		Human.announceName("Vinit");
	    
		Human.reproduction(false);
		
	}
	
	
}

class Animal{
	
	public static void announceName (String name) {
		
		System.out.println("Your name is "+ name);
	}
	
	public static void announceWeight(double weight) {
		
		System.out.println("You have entered "+ weight+"as weight");
		
	}
	
}

class  Human extends Animal{
	

	public static void reproduction(boolean reproduce) {
		
	if (reproduce==true) 
		System.out.println("you can reproduce");
	else
		System.out.println("You cannot reproduce");
	} 
	
	public static void announceName(String name) {
		System.out.println("You have successfully overridden the method announceName()");
	}
	
}


class Dog{}

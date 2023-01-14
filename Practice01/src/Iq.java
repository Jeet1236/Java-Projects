import java.util.Scanner;
public class Iq {
	public static void main(String[] args) {
		/*
		IqDetails details = new IqDetails();
		System.out.println("Enter you mental Age");
		Scanner mentalAge1 = new Scanner(System.in);
		double mentalAge = mentalAge1.nextDouble();
		System.out.println("Enter you cA");
		Scanner cA1 = new Scanner(System.in);
		double cA = cA1.nextDouble();
	details.setMentalAge(mentalAge);
	details.setcA(cA);
	System.out.print("Your Iq is " + details.printIq());
		*/
		/*
// Declaring an array
		String [] myName = new String[45];
// initializing an array
		myName[0] = "hi";
		myName[1] = "hello";
		System.out.println(myName[0]);
// Declaring and initializing an array
String practice[] = {"Hello", "Hi " ,"bye bye"  };
System.out.println(practice[2]);


// how continue and break works 
for (int i =0;i<5;i++) {
	
	if (i==2)
		continue;
	System.out.println(i);
		
}

System.out.println("hi, welcome to visual studio code");
for (String name : practice) {
	System.out.println(name);
	*/
		
		/*
}


int numOfDuplicate = 0;
int [] checkDuplicate = {1,1,4,5,4,4};
for(int i=0;i<checkDuplicate.length;i++) {
	
for(int z=i+1;z<checkDuplicate.length;z++) {
	if(checkDuplicate[i]==checkDuplicate[z]) {
		numOfDuplicate++;
	}
}
	
}
System.out.println(numOfDuplicate);
*/
		
		int m = 50;
		for(int n=1;n<=m;n++) {
			boolean flag = false;
			for(int i=1;i<=m/2;i++) {
				if(n%i==0) {
					flag = true;
					break;}
				}
			
			if(flag==false) {
				System.out.println(n);}
		}
	}

}

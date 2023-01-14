import java.util.Random;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab2 thisLab = new Lab2();

		int counter = 97; // ASCII lowercase a.

		Random myrand = new Random(); // For random number generation.

		int rows = myrand.nextInt(5) + 1;

		char[][] myArray = new char[rows][]; // Creation of random-height 2D array.

		for (int i = 0; i < rows; i++) // This loop creates rows of random length.
		{

			int cols = myrand.nextInt(5) + 2; // Value from 0 to 6.
			myArray[i] = new char[cols]; // NB: There may be 0-width rows!

//			for (int j = 0; j < cols; j++) {
//				
//				
//				System.out.print(myArray[i][j] + " ");}
			System.out.println("");
			for (int j = 0; j < cols; j++) {
				System.out.print("+-----+");
			}
			System.out.println("");
			for (int j = 0; j < cols; j++) {
				System.out.print("|     |");
			}

			System.out.println("");
			for (int j = 0; j < cols; j++) {
				myArray[i][j] = (char) counter++;
				System.out.print("|  " + myArray[i][j] + "  |");
			}
			System.out.println("");

			for (int j = 0; j < cols; j++) {
				System.out.print("|     |");
			}
			System.out.println("");

			for (int j = 0; j < cols; j++) {
				System.out.print("+-----+");
			}

			System.out.println();
		}


	}

}
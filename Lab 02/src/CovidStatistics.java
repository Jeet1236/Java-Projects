
/**
 * This class shows the number of recovered patients across 7 provinces in
 * Canada over the period of 8 months from February to September in the year
 * 2020. It also shows the total recovered patients in each month.
 * 
 * <pre>
 * Student name: Jeet Patel
 * </pre>
 * 
 * <pre>
 *  Student number : 041060909
 * </pre>
 * 
 * <pre>
 * Class: CST8284
 * </pre>
 * 
 * <pre>
 * Professor: Fedor Ilitchev
 * </pre>
 * 
 * <pre>
 * Date: Sept. 27, 2022
 * </pre>
 * 
 * @author Jeet Patel
 * @version 11.0.15
 * 
 * 
 */

public class CovidStatistics {

	/**
	 * This method does the whole job of printing the data
	 * 
	 * @param args - This is the command line input
	 * 
	 */

	public static void main(String[] args) {
		/**
		 * Declaring variables and arrays
		 */
		final int ROWS = 7;
		final int COLUMNS = 8;
		int[] sumStorage = new int[COLUMNS];

		/**
		 * Declaring 2D array which contain the list of recovered patients. Here each
		 * row contains the province and each column is for month
		 * 
		 */
		int[][] patients = { { 2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
				{ 5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, { 1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 },
				{ 1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 }, { 1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
				{ 1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 }, { 1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }

		};

		String[] provinces = { "Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia",
				"Prince Edward Island" };

		System.out.println(
				"               Month      Feb      March    April    May      June     July     Aug      Sept");
		System.out.println();

		/**
		 * This is the nested loop for printing the provinces and recovered patients.
		 * The parent for loop changes the row while the nested loop changes the column
		 * for correcting formating
		 * 
		 */
		for (int i = 0; i < provinces.length; i++) {
			System.out.printf("%21s", provinces[i]);
			for (int j = 0; j < patients[i].length; j++) {

				System.out.print("     " + patients[i][j]);

			}
			System.out.println("\n");

		}

		/**
		 * This nested for loop prints the total recovered patients for each month. The
		 * parent loop change the month and the nested loop store the total for each
		 * month.
		 */

		for (int i = 0; i < COLUMNS; i++) {
			for (int j = 0; j < ROWS; j++) {
				sumStorage[i] += patients[j][i];

			}
		}
		System.out.println();
		System.out.printf("%21s", "Recovered Patients");

		/**
		 * This for loop print the total recovered patient in the correct format.
		 */
		for (int i = 0; i < sumStorage.length; i++) {
			System.out.printf("%9s", sumStorage[i]);
		}

		System.out.println();
		System.out.println();
		System.out.println("               Vaccinate and maintain good health practices!");
	}
}

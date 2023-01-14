/**
 * This class demonstrate the concept of rethrowing the exceptions.
 * EasterEnding() method throws the IllegalArgumentException()
 * EasterStarting() method calls the EasterEnding() method and it rethrows the exception.
 * The main method calls EasterStarting() method and it finally catches the rethrown exception
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
 * Date: 30 November, 2022
 * </pre>
 * 
 * @author Jeet Patel
 * @version 11.0.15
 */
public class FishHandler {

	/**
	 * Throws an exception IllegalArgumentException
	 * */
	public static void EasterEnding() throws IllegalArgumentException {
		
		throw new IllegalArgumentException();
	}
	
	/**
	 * Calls the EasterEnding() and rethrows the exception IllegalArgumentException()
	 * */
	public static void EasterStarting() {
		
		
		try {
			EasterEnding();
			}
		catch(IllegalArgumentException illegalArgument) {
			
			throw illegalArgument;
		}
	}
	/**
	 * Calls EasterStarting and catches the exception which was rethrown by EasterStarting()
	 * */
	public static void main(String[] args) {
		
		try {
			EasterStarting();
		}
		catch(IllegalArgumentException illegalArgument) {
			System.err.println("---Rethrown exception IllegalArgumentException is caught---");
			illegalArgument.printStackTrace();
		}

	}

}

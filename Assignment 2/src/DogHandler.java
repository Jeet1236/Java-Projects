
import java.io.*;

/**
 * Four Exception subclasses named
 * ExceptionDog,NullPointerException,ExceptionPuppy and IOException are thrown
 * using four separate methods. Each method throw the exception and it is caught
 * by the class Exception
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
public class DogHandler {
	static DogHandler dogHandler = new DogHandler();

	/**
	 * This class is inherited from the class Exception
	 */
	public class ExceptionDog extends Exception {
	};

	/**
	 * This class is inherited from the class ExceptionDog
	 */
	public class ExceptionPuppy extends ExceptionDog {
	};

	/**
	 * This method throws ExceptionDog exception and catches the exception by class
	 * Exception
	 */
	public static void exceptionDog() throws DogHandler.ExceptionDog {

		try {
			throw dogHandler.new ExceptionDog();
		} catch (Exception exception) {
			System.err.println("---ExceptionDog is caught successfully---");
			exception.printStackTrace();
		}

	}

	/**
	 * This method throws ExceptionPuppy exception and catches the exception by
	 * class Exception
	 */
	public static void exceptionPuppy() throws DogHandler.ExceptionPuppy {

		try {
			throw dogHandler.new ExceptionPuppy();
		}

		catch (Exception exception) {
			System.err.println("---ExceptionPuppy is caught successfully--");
			exception.printStackTrace();
		}

	}

	/**
	 * This method throws NullPointerException exception and catches the exception
	 * by class Exception
	 */

	public static void exceptionNullPointer() throws NullPointerException {

		try {

			Object nullPointer = null;
			nullPointer.toString();

		}

		catch (Exception exception) {
			System.err.println("---NullPointerException is caught successfully---");
			exception.printStackTrace();
		}

	}

	/**
	 * This method throws IOException exception and catches the exception by class
	 * Exception
	 */
	public static void exceptionIO() throws IOException {

		try {

			throw new IOException();

		}

		catch (Exception exception) {
			System.err.println("---Exception IO is caught successfully---");
			exception.printStackTrace();
			
		}

	}

	/**
	 * @param args This method invokes all the above four methods.
	 */
	public static void main(String[] args) throws DogHandler.ExceptionDog, IOException {
		exceptionDog();
		exceptionPuppy();
		exceptionNullPointer();
		exceptionIO();

	}

}

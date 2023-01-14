
/**
 * This class contains nested exceptions classes inherited from Exception.
 * Errors are thrown of this nested subclasses and then caught using
 * ExceptionAlpha which is the subclass of CatHandler.
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

public class CatHandler {

	static CatHandler catHandler = new CatHandler();

	/**
	 * This class is inherited from the class Exception
	 */
	public class ExceptionAlpha extends Exception {
	}

	/**
	 * This class is inherited from the class ExceptionAlpha
	 */
	public class ExceptionBeta extends ExceptionAlpha {
	}

	/**
	 * This class is inherited from the class ExceptionBeta
	 */
	public class ExceptionGammer extends ExceptionBeta {
	}

	/**
	 * This class throws the exception class ExceptionGammer
	 */
	public static void gammerException() throws CatHandler.ExceptionGammer {

		throw catHandler.new ExceptionGammer();

	}

	/**
	 * This class throws the exception class ExceptionBeta
	 */
	public static void betaException() throws CatHandler.ExceptionBeta {

		throw catHandler.new ExceptionBeta();

	}

	/**
	 * @param args - command line argument 
	 * gammerException() and betaException()
	 * methods are invoked in the try block and the exceptions are
	 * caught by the Exception subclass ExceptionAlpha
	 */

	public static void main(String[] args) {

		try {
			gammerException();
		} catch (ExceptionAlpha alphexception) {
			System.err.println("---Exception gammer is caught---" );
			alphexception.printStackTrace();
		}

		try {
			betaException();
		}

		catch (ExceptionAlpha alphexception) {
			System.err.println("---Exception Beta is caught---");
			alphexception.printStackTrace();
		}

	}

}

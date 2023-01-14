import java.io.*;

/**
 * This class shows that if the parent class is called before the child
 * subclass for catching the exception then it gives the compilation error. The
 * error is fixed by calling the child subclass exception before parent
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

public class OrderHandler {

	/**
	 * @param args 
	 * This method instantiate two objects of Exception and IOException
	 * The commented portion contains the compilation error as the
	 * parent Exception is used before the child exception for catching
	 * the exception. It also contains the possible solution to this
	 * problem.
	 */
	public static void main(String[] args) {
		Exception parentException = new Exception();
		IOException childException = new IOException();

//		try {
//			throw childException;
//		}
//		catch (Exception exception) {
//
//			System.err.println("error ");
//		}
//		catch(IOException childException2) {
//			System.err.println("ERROR ERROR");
//		}

		try {
			throw childException;
		} catch (IOException childException2) {
			System.err.println("---IOException is caught by the childException---");
			childException2.printStackTrace();
		} catch (Exception exception) {
			System.err.println("---Parent class caught the exception---");
		}

	}

}

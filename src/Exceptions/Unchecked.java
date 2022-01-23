package Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Unchecked {

	public static void main(String[] args) {
	/*	// Arithmetic Exception
	 * 
		System.out.println(4/0);
		
	*/
		//Null Pointer Exception
		/*Set <Integer> a=new TreeSet<>();
		a.add(null);
		System.out.println(a);*/
		
		// InputMismatch Exception
	/*	Scanner s=new Scanner(System.in);
		s.nextInt(); */
		
		// ArrayIndexOutOfBound Exception
	/*	int a[]=new int[2];
		System.out.println(a[2]);   */
		
		// StringIndexOutOfBound Exception
	/*	String a="dilip";
		System.out.println(a.charAt(5));  */
		
		// IndexOutOfBounds Exception
	/*	List <Integer> l=new ArrayList<>();
		System.out.println(l.get(2));     */
		
		// NumberFormatException
	/*	String a="12aa";
		int parseInt = Integer.parseInt(a);    */
		
		//Handling Exception
		
		try {
			System.out.println(4/0);
		}
		catch(Exception e) {
			System.out.println("Exception occurs");
		}
	/*	catch (NullPointerException e) {
		System.out.println("Null Pointer exception is Handling");
		}
		catch (InputMismatchException e) {
			System.out.println(" InputMismatch Exception is Handling");
			}
		catch (ArithmeticException e) {
			System.out.println(" Arithmetic Exception is Handling");
			}*/
		finally {
			System.out.println("All exception is Handling");
		}
		
		
		
		

}
}
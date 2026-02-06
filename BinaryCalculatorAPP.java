package week3;

import java.util.Scanner;
public class BinaryCalculatorAPP {

	// This program performs basic calculations with user-inputted binary numbers.
	
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {

		// Declare the variables that will be used in the computations:
		String x;
		String y;
		
		// Input the two binary numbers:
		System.out.println("Enter two binary numbers to use for computations:");
		System.out.print("x = ");
		x = userinput.nextLine();
		System.out.print("y = ");
		y = userinput.nextLine(); 
		
		// Perform the calculations:
		System.out.println("\nThe sum of the numbers is " + Integer.toBinaryString(Integer.parseInt(x) + Integer.parseInt(y)));
		System.out.println("The difference between the numbers is " + Integer.toBinaryString(Integer.parseInt(x) - Integer.parseInt(y)));
		System.out.println("The product of the numbers is " + Integer.toBinaryString(Integer.parseInt(x) * Integer.parseInt(y)));
		System.out.println("The quotient of the numbers is " + Integer.toBinaryString(Integer.parseInt(x) + Integer.parseInt(y)));
		
		
	}

}

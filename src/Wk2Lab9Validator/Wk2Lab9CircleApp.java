package Wk2Lab9Validator;

import java.util.Scanner;

public class Wk2Lab9CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Lab9Circle circ1 = new Lab9Circle();

		
		String cont;
		
		System.out.println("Welcome to the Circle Tester");
		
		do {
		int radius = Lab9Circle.getInt(scan, "Enter radius: ");
		System.out.print("Circumference: ");
		circ1.getCircumf(radius);
		System.out.print("Area: ");
		circ1.getArea(radius);
		cont = Lab9Circle.getString(scan, "Would you like to continue measuring? Press Y for yes, any other key for no.");
		}while (cont.equalsIgnoreCase("Y"));
		
		System.out.println("Thank you! Goodbye");
		
	}

}

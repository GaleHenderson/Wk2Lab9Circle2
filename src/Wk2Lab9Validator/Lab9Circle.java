package Wk2Lab9Validator;

import java.util.Scanner;

public class Lab9Circle {

	public static int getInt(Scanner scan, String prompt) {
		int num = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (scan.hasNextInt()) {
				num = scan.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid entry. Please try again.");
			}
			scan.nextLine(); // garbage line
		}
		return num;
	}

	public double getCircumf(double radius) {
		double circumf = (Math.PI * (2 * radius));
		System.out.println(formatNum(circumf));
		return circumf;
	}

	public double getArea(double radius) {
		double area = (Math.PI * (Math.pow(radius, 2)));
		System.out.println(formatNum(area));
		return area;
	}

	public static String getString(Scanner scan, String prompt) {
		System.out.print(prompt);
		String s = scan.nextLine(); // read user entry
		//scan.nextLine(); // discard any other data entered on the line
		return s;
	}

	private String formatNum(double num) {
//	double num1 = 0;
//	Double.toString(num1);

		return String.format("%.2f", num);
	}

}

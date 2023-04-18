package com.linecomparison;
import java.util.Scanner;

public class UC3_Comparing_2_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM");
		System.out.println("--------------------------------------------------");

		Scanner sc = new Scanner(System.in);

		// Initializing
		int x1, x2, y1, y2;
		double length_of_line_1;

		System.out.println("LINE 1 CO-ORDINATES");
		System.out.println();

		// User Input
		System.out.println("Enter the value of x1 : ");
		x1 = sc.nextInt();

		System.out.println("Enter the value of y1 : ");
		y1 = sc.nextInt();

		System.out.println("Enter the value of x2 : ");
		x2 = sc.nextInt();

		System.out.println("Enter the value of y2 : ");
		y2 = sc.nextInt();

		System.out.println("--------------------------------------------------");

		// Calculating Length of line 1 using Cartesian System
		length_of_line_1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of a line 1 : " + length_of_line_1);
		System.out.println("--------------------------------------------------");
		System.out.println();

		// Initializing
		int x3, x4, y3, y4;
		double length_of_line_2;

		System.out.println("LINE 2 CO-ORDINATES");
		System.out.println();

		// User Input
		System.out.println("Enter the value of x3 : ");
		x3 = sc.nextInt();

		System.out.println("Enter the value of y3 : ");
		y3 = sc.nextInt();

		System.out.println("Enter the value of x4 : ");
		x4 = sc.nextInt();

		System.out.println("Enter the value of y4 : ");
		y4 = sc.nextInt();

		System.out.println("--------------------------------------------------");

		// Calculating Length of line 2 using Cartesian System
		length_of_line_2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		System.out.println("Length of a line 2 : " + length_of_line_2);
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		
		/* Converting the values of line1 and line2
		 * into string so that we can use equals and compare
		 * method
		 */
		String Line_1 = String.valueOf(length_of_line_1);
		String Line_2 = String.valueOf(length_of_line_2);
		

		/*
		 * Checking if the length of both the lines are equal or not.
		 */
		if (Line_1.equals(Line_2)) {
			System.out.println("Length of Line1 and Line2 are equal");
		} else {
			System.out.println("Length of Line1 and Line2 are not equal");
		}
		System.out.println("--------------------------------------------------");
		
		
		/*
		 * Checking if the length of line 1 
		 * is less than or greater than line 2
		 */
		int compare = Line_1.compareTo(Line_2);
	
		if(compare > 0) {
			System.out.println("Line 1 is greater than Line 2");
		}
		else {
			System.out.println("Line 1 is less than Line 2");
		}

	}

}

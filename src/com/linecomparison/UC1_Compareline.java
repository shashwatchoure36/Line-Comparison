package com.linecomparison;
import java.util.Scanner;

public class UC1_Compareline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM");
		System.out.println("--------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);

		// Initializing
		int x1, x2, y1, y2;
		double length_of_line;

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
		length_of_line = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Length of a line : " + length_of_line);

	}

}

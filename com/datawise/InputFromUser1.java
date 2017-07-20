package com.datawise;

import java.util.Scanner;

public class InputFromUser1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter a String");
		String lsLineString = input.nextLine();
		
		System.out.println("Enter a Integer");
		int lsInt = input.nextInt();
	
		
		System.out.println("Enter a Floating value");
		Double lsFloat = input.nextDouble();
	
		
		System.out.println("The String value is: " + lsLineString);
		System.out.println("The Integer value is: " + lsInt);
		System.out.println("The Floating value is: " + lsFloat);

		input.close();
	}

	

}

package com.datawise;

import java.util.Scanner;

public class InputFromUserWithDoWhile {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		int lsInt =0;
		do {
			System.out.println("Enter a Integer");
			lsInt = input.nextInt();
		} while(lsInt !=5);
		System.out.println("I Got 5");
		
		input.close();
	}

	

}

package com.datawise;

public class EnhancedLoop {

	public static void main(String[] args) {

		int numbers[] = {10,20,30};
		String names[] = {"Divakar","Vidya","Manas"};
		
		for ( int x : numbers) {
			System.out.println(x);
		}
		
		for ( String s : names) {
			System.out.println(s);
		}
		
		
	}

}

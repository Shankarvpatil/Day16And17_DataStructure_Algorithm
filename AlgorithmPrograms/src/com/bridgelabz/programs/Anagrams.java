package com.bridgelabz.programs;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String x = "aRAdHYA";
		String y = "HRADAYA";
		
		x= x.toLowerCase();
		y= y.toLowerCase();
		
		char x1[] = x.toCharArray();	
		char y1[] = y.toCharArray();	
		
		Arrays.sort(x1);
		Arrays.sort(y1);
		
		boolean result = Arrays.equals(x1, y1);
		if(result == true) {
			System.out.println("Strings are anagrams");
		}
		else {
			System.out.println("Strings are not anagrams");
		}

	}

}

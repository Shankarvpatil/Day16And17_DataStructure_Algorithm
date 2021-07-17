package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class UnOrderedUtility{
	
	private static final Scanner sc = null;


	public UnOrderedUtility() {
		Scanner sc;
		sc = new Scanner(System.in);

}


public void readWordFromFile() {
	try {
		File file = new File("C:\\Users\\Shankar Patil\\eclipse-workspace\\AlgorithmPrograms\\src\\Test");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String words = buffer.readLine();
		//System.out.println(words.toString());
		String arr[] = words.split(" ");
		
		LinkedListPrg list = new LinkedListPrg();
		
		for (String i: arr) {
			list.addStrElement(i);;
		}
		
		System.out.println( "\n"+list.printStrList());
		System.out.print("Enter the string to check is Present in List: ");
		//String searchWord = sc.next();
		//String resultFinal = list.removeOrAdd(searchWord);
		
	}
	 catch (Exception e){
           // System.out.println("file not found");
		 e.printStackTrace();
        }
	
	}
}
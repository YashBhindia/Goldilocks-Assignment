package com.goldilocks;

import java.util.Scanner;

public class Main {
	
	public static String decimalnumberstringTOBinarystring(String decnum) {
		
		try {
			
			int number = Integer.parseInt(decnum);
			
			if (number <= 0) {
	            return " Negative decimal values and zero value are not taken";
			}
			
			StringBuilder binary = new StringBuilder();
			
	        while (number > 0) {
	        	
	            int rem = number % 2;
	            binary.insert(0, rem);
	            number /= 2;
	            
	        }

	        return binary.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
			return "Not a valid decimal number.";
		}
		
		
		
	}

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the number which you want to convert");
		 
		 String decnum = scan.next();
		 
		 String ans = Main.decimalnumberstringTOBinarystring(decnum);
		 
		 System.out.println(decnum+" is "+ans);
	}
}

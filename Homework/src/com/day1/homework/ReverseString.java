package com.day1.homework;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        // Reverse the string
	        String reversed = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }

	        // Display the reversed string
	        System.out.println("Reversed string: " + reversed);

	        
	        scanner.close();
	}

}

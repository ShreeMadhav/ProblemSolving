package com.day1.homework;

import java.util.Scanner;

public class GCDCalculator {
	 public static int findGCD(int num1, int num2) {
	        while (num2 != 0) {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }
	        return num1;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter two numbers
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        // Calculate and display the GCD
	        int gcd = findGCD(num1, num2);
	        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

	        scanner.close();
	    }

}

package com.day1.homework;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of n
        System.out.print("Enter the number of even numbers to generate: ");
        int n = scanner.nextInt();

        System.out.println("The first " + n + " even numbers are:");
        
        // Generate and print the first n even numbers
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i);
        }
        
        scanner.close();
	}

}

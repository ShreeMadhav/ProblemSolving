package com.day1.homework;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Ask the user for the size of the array
		        System.out.print("Enter the number of elements in the array: ");
		        int n = scanner.nextInt();
		        
		        // Declare the array
		        int[] array = new int[n];
		        
		        // Input the elements of the array
		        System.out.println("Enter the elements of the array: ");
		        for (int i = 0; i < n; i++) {
		            array[i] = scanner.nextInt();
		        }
		        
		        // Initialize max and min with the first element
		        int max = array[0];
		        int min = array[0];
		        
		        // Iterate through the array to find max and min
		        for (int i = 1; i < n; i++) {
		            if (array[i] > max) {
		                max = array[i];
		            }
		            if (array[i] < min) {
		                min = array[i];
		            }
		        }
		        
		        // Print the results
		        System.out.println("Maximum value in the array: " + max);
		        System.out.println("Minimum value in the array: " + min);

		        // Close the scanner
		        scanner.close();
		    }
		}

package cmsc203lab2;

import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
   Do Task #1 before adding Task#2 where indicated.
*/
// Task 1 Completed
// Task 2 Completed
// Programmer: Gabriel I Feliz
public class NumericTypes { // Change class name to NumericTypes so that it compiles successfully
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);//TASK #2 Create a Scanner object here 
		//identifier declarations
		final double NUMBER = 2 ; // number of scores. Change datatype to double to avoid integer division in the average formula
		//int score1 = 100; // first test score
		//int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		double userTemperature; //Task #2 declare a variable to hold the user’s temperature
		System.out.print("Please enter a score: "); //Task #2 prompt user to input score1
		int score1 = sc.nextInt(); //Task #2 read score1 
		System.out.print("Please enter a second score: ");//Task #2 prompt user to input score2
		int score2 = sc.nextInt(); //Task #2 read score2 
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER; // Place sum into parentheses for the average formula to work
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9) * (BOILING_IN_F - 32); // Write 5 as 5.0 to generate result of datatype double in division
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.print("Please enter another temperature in Fahrenheit: ");//Task #2 prompt user to input another temperature
		userTemperature = sc.nextDouble(); //Task #2 read the user’s temperature in Fahrenheit
		fToC = (5.0/9) * (userTemperature - 32);//Task #2 convert the user’s temperature to Celsius
		System.out.println(userTemperature + " in Fahrenheit is " + fToC + " in Celsius.");//Task #2 print the user’s temperature in Celsius
		System.out.println("Goodbye"); // to show that the program is ended	
		
		sc.close(); // Close Scanner object to avoid resource leak
	}
}
package cmsc203lab2;

import java.util.Scanner;

//Task 3 Completed
//Programmer: Gabriel I Feliz
public class SphereVolume {

	public static void main(String[] args) {

		// Create Scanner object to read user input
		Scanner sc = new Scanner(System.in);

		// Declare variables to save values of the diameter, radius, and volume of a sphere
		double diam, radius, sphereVol;
		
		// Print the purpose of the program
		System.out.println("\nThis program will calculate the volume of a sphere\n");

		// Prompt user for diameter of a sphere
		System.out.print("Please enter the diameter value of a sphere: ");
		// Read diameter value and save it to double variable diam
		diam = sc.nextDouble();
		
		// Iterate multiple times while the double variable diam is negative
		while (diam < 0) {
			// Print exception message and prompt user to re enter diameter of a sphere
			System.out.print("Diameter cannot be negative. Please enter a positive diameter value: ");
			// Read diameter value and save it to double variable diam
			diam = sc.nextDouble();
		}
		
		// Calculate radius as half the diameter and save result to double variable radius
		radius = diam / 2;
		
		// Calculate volume of a sphere as (4 pi r^3)/3 and save result to double variable sphereVol
		sphereVol = (4.0/3) * Math.PI * Math.pow(radius, 3);
		
		// Display the volume of the sphere
		System.out.println("The volume of the sphere is " + sphereVol);
		System.out.println("\nGoodbye!");
		
		sc.close(); // Close Scanner object to avoid resource leak
	}

}
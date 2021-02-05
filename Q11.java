package assignments_4;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the medium ( Air, Water or Steel) : ");
		String medium = scan.next();
		System.out.println("Enter the distance in feet : ");
		double distance = scan.nextDouble();

		
		switch (medium) {
		case "Air":
			System.out.println("The travel time is: " + (distance / 1100));
			break;
		case "Water":
			System.out.println("The travel time is: " + (distance / 4900));
			break;
		case "Steel":
			System.out.println("The travel time is: " + (distance / 16400));
			break;

		default:
			System.out.println("The input is invalid.");
			break;
		}

	}

}

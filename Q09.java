package assignments_4;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the weight of the package : ");
		int weight = scan.nextInt();

		System.out.println("Enter the mile");
		int mileData = scan.nextInt();

		int mile = ((mileData - 1) / 500) + 1;
		double fee = 0;

		if (weight <= 2)
			fee = 1.10;
		else if (weight <= 6)
			fee = 2.20;
		else if (weight <= 10)
			fee = 3.70;

		System.out.println("The shipping charge is $ " + fee * mile);
	}

}

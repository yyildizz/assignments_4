package assignments_4;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int price = 99;
		double total = 0;
		double discount = 0;
		System.out.println("Enter the weight of the package : ");
		int weight = scan.nextInt();
		
		if (weight<=2)System.out.println("The shipping charge is $ 1.10");
		else if (weight<=6)System.out.println("The shipping charge is $ 2.20");
		else if (weight<=10)System.out.println("The shipping charge is $ 3.70");
		else System.out.println("The shipping charge is $ 3.80");
		
	}

}

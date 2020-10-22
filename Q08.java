package assignments_4;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int price = 99;
		double total = 0;
		double discount = 0;
		System.out.println("Enter the number of packages : ");
		int packages = scan.nextInt();

		if (packages >= 100)	discount = price * packages * 0.5;
		 else if (packages >= 50) 	discount = price * packages * 0.4;
		 else if (packages >= 20) 	discount = price * packages * 0.3;
		 else if (packages >= 10) 	discount = price * packages * 0.2;
		
		System.out.println("The total amount is " + ((price*packages)-discount)  + " and the discount is " + discount);
	}

}

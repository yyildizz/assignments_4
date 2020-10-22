package assignments_4;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Question-2
		 * 
		 * Tax Calculator:
		 * 
		 * - Let user enter his income
		 * 
		 * - Calculate the tax amount according to below table
		 * 
		 * - Print the tax amount Income Tax Ratio income <=150,000,000 %25 income
		 * <=300,000,000 %30 income <=600,000,000 %35 income <=1,200,000,000 %40 income
		 * >1,200,000,000 %50
		 * 
		 * Sample Output-1
		 * 
		 * Your Income : 1500
		 * 
		 * The tax amount you have to pay : 375.0
		 * 
		 * Sample Output-2
		 * 
		 * Your Income : 1200000
		 * 
		 * The tax amount you have to pay : 300000.0
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Your Income : ");
		double income = scan.nextDouble();
		double tax = 0;
		if (income <= 150_000_000) {
			tax = income * 0.25;
		} else if (income <= 300_000_000) {
			tax = ((income - 150_000_000) * 0.30) + 37_500_000;
		} else if (income <= 600_000_000) {
			tax = ((income - 300_000_000) * 0.35) + 82_500_000;
		} else if (income <= 1_200_000_000) {
			tax = ((income - 600_000_000) * 0.40) + 187_500_000;
		} else
			tax = ((income - 1_200_000_000) * 0.50) + 427_500_000;

		System.out.println("The tax amount you have to pay : " + tax);
	}

}

package assignments_4;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		// a number of calories and fat grams

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of checks : ");
		int number = scan.nextInt();
		double fee = 10.0;
		if (number < 20)
			fee += number * 0.10;
		else if (number <40)
			fee += number * 0.08;
		else if (number <60)
			fee += number * 0.06;
		else fee += number * 0.04;
		
		System.out.println("The bank's service fees for the month is $"+fee);
	}

}

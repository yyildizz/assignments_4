package assignments_4;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {

		// a number of calories and fat grams

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of books : ");
		int number = scan.nextInt();
		int points = 0;
		
		if (number < 1);
		else if (number <2)points = 5;
		else if (number <3)points = 15;
		else if (number <4)points = 30;
		else points = 60;
		
		System.out.println("The number of points awarded is "+points);
	}

}

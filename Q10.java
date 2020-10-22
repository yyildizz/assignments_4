package assignments_4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		// a number of calories and fat grams

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of calories in your food: ");
		double calories = scan.nextDouble();

		System.out.println("Enter fat grams in your food: ");
		int fat = scan.nextInt();

		int fatCalories = fat * 9;

		if (fatCalories >= calories)
			System.out.println("The input is invalid.");

		double percentage = fatCalories / calories;
		int intPercentage = (int)(percentage*100);
		System.out.println("The percentage of calories that come from fat is %" + intPercentage);
		
		if (percentage < 0.3)
			System.out.println("The food is low in fat.");

	}

}

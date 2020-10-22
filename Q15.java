package assignments_4;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		// a number of calories and fat grams

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		
		switch (number) {
		case 0,1,2:System.out.println("Low number");
			break;
		case 3,4,5:System.out.println("Medium number");
		break;
		
		default:System.out.println("Other number");
			break;
		}
		
	}

}

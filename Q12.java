package assignments_4;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {

		// a number of calories and fat grams

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the package name ( A, B or C) : ");
		char packageName = scan.next().charAt(0);
		double usage = 0;
		if (packageName=='C'); else	{	System.out.println("Enter the number of usage hours : ");

		 usage = scan.nextDouble();}

		switch (packageName) {
		case 'A':
			if(usage <10)System.out.println("Your monthly bill is $9.95");
			else System.out.println("Your monthly bill is $" + (9.95 + 2 * (usage - 10)));
			break;
		case 'B':		
			if(usage < 20)System.out.println("Your monthly bill is $13.95");
			else System.out.println("Your monthly bill is $" + (13.95 + (usage - 20)));
			break;
		case 'C':			
			System.out.println("Your monthly bill is $19.95");
			break;
		default:System.out.println("The input is invalid.");
			break;
		}

	}

}

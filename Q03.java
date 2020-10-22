package assignments_4;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = scan.nextInt();
		
		boolean leap = false;
		
		if (year%4 == 0) leap = true;
		if (year%100 == 0) leap = false;
		if (year % 400 == 0) leap = true;
		
		if(leap)System.out.println("Leap Year");
		else System.out.println("NOT a Leap Year");
		
	}

}

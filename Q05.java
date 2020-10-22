package assignments_4;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int day,month,year;
		System.out.println("Enter day : ");
		day = scan.nextInt();
		System.out.println("Enter month : ");
		month = scan.nextInt();
		System.out.println("Enter year : ");
		year = scan.nextInt();
	
	if (day*month == year)System.out.println("Date is magic");
	else System.out.println("Date is NOT magic");
	}

}

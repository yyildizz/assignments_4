package assignments_4;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
//		Telephone Bill
//		Write a Java program to calculate the monthly telephone bills as per the following rule: 
//		Minimum $200 for up to 100 calls. 
//		Plus $0.60 per call for the next 50 calls. 
//		Plus $0.50 per call for the next 50 calls. 
//		Plus $0.40 per call for any call beyond 200 calls.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter call number : ");
		double call = scan.nextDouble();
		double bill = 0;
		
		if (call <=100) bill = 200;
		else if (150 >=call && call >100)bill = 200 + (0.60*(call-100));
		else if (200 >=call)bill = 200 + (0.60*50)+ (0.50*(call-150));
		else bill = 200 + (0.60*50)+ (0.50*50)+(0.40*(call-200));

		System.out.println("The bill is: " + bill);
		
		
	}

}

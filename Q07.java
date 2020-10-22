package assignments_4;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter seconds : ");
		int seconds = scan.nextInt();
		
		if(seconds>=86400)System.out.println("There are "+ (seconds/86400) + " days in " + seconds + " seconds");
		else if (seconds>=3600) System.out.println("There are "+ (seconds/3600) + " hours in " + seconds + " seconds");
		else if (seconds>=60) System.out.println("There are "+ (seconds/60) + " minutes in " + seconds + " seconds");
	}

}

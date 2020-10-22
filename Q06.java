package assignments_4;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter object's mass : ");
		int mass = scan.nextInt();
		
		if((mass*9.8)<10)System.out.println("Object is too light");
		else if ((mass*9.8)>1000)System.out.println("Object is too heavy");
		
	}

}

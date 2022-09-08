package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What is an integer value?");
		int y1 = in.nextInt();
		boolean LeapYear = (y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0);
		System.out.println(+ y1 + " is a leap year : " + LeapYear);
		
		
		
		

	}

}
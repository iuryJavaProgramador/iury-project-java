package com.java.iury;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1;
		int n2;
		int sum;
		int mult;
		
		System.out.println("Enter odd numbers between 0 and 30");
		
		System.out.println("Enter the first number:");
		n1 = scan.nextInt();
		
		System.out.println("Enter the secund number:");
		n2 = scan.nextInt();		 
		
		if (n1 <= 30 & n2 <= 30) {
			sum = n1 + n2;		
		    System.out.println("The sum of n1 + n2 is: " +sum + n1%1 );	
		 
		} else if (n1 > 30 | n2 > 30 ) {
			 System.out.println("One of the numbers is greater than 30.");
		
		} else if (n1 > 30 & n2 > 30 ) {
			 System.out.println("The numbers are greater than 30.");
		} 	
	}
}

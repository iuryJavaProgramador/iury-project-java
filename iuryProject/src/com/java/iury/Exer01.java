package com.java.iury;

import java.util.Scanner;

public class Exer01 {
	// "Create a Java class named MaiorNumero that contains a method to receive two integer numbers and print the greater one among them.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int greaterNumber;
		int n1;
		int n2;	
		
		System.out.println("Enter the first number:");
		n1 = scan.nextInt();
		System.out.println("Enter the secund number:");
		n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("N1 is great than N2");
		
		} else {
			System.out.println("N2 is great than N1");
		}

	}

}

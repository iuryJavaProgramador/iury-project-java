package com.java.iury;

import java.security.KeyStore.Entry;
import java.util.Scanner;

public class EstruturasDeDecisao {

	public static void main(String[] args) {
		// positive,negative or neutral
		
		
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.println("Type a value:");
		x = scan.nextInt();
		
		if (x > 0) {
			System.out.println("The number is positive.");
		
		} else {
			System.out.println("The number is negative or neutral.");
		}

	}

}

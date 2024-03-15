package com.java.iury;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// Read 2 fractional values and ask the user which arithmetic operation they want to perform with them. Use switch/case. Provide the result of the operation.
  
		Scanner input = new Scanner(System.in);

		float value1, value2;
		char operation;
		
		System.out.println("Choose your operation[+ - * /]: ");
		operation = input.nextLine().charAt(0);
		
		System.out.println("Enter the first value");
		value1 = input.nextFloat();
		
		System.out.println("Enter the secund value");
		value2 = input.nextFloat();
		
		switch ( operation ) 
		{
		  case '+':
			System.out.println("Value1 + Value2 = " + (value1 + value2));
			break;
			
		  case '-':
				System.out.println("Value1 - Value2 = " + (value1 - value2));
				break;
				
		  case '*':
				System.out.println("Value1 * Value2 = " +  (value1 * value2));
				break;
				
		  case '/':
				System.out.println("Value1 / Value2 = " +  (value1 / value2));
				break;
				
		  default:
			  System.out.println("You entered an invalid operation.");
              break;
              
		}
	}
}
  


		  
		  
		



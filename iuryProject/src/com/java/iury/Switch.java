package com.java.iury;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner entrada = new Scanner(System.in);
	   
		int x;
       
	    System.out.println("Type a number:");
	    x = entrada.nextInt();
		
	    switch (x) 		
		{
		case 1:
		  System.out.println("one");
		  break;
		case 2:
		  System.out.println("Two");
		  break;
		default:
		  System.out.println("Unknown");
		}	
	}
}



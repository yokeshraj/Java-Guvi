package com.Task1;

import java.util.Scanner;

public class PositiveAndNegative {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		do {
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println(n + " is Postive");
		}
		else {
			System.out.println(n + " is Negative");
		
		}
		
		 System.out.println("Do you want to try again? (y/n)");
		 choice=sc.next().charAt(0);
		 
		}
		 while(choice == 'y' || choice == 'Y');
	        
	        sc.close();
	}
	
}

package com.Task1;

import java.util.Scanner;

public class SmallestOfThree {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		char choice;
		do {
		System.out.println("Enter the First Number");
		int n= sc.nextInt();
		System.out.println("Enter the Second Number");
		int m= sc.nextInt();
		System.out.println("Enter the Third Number");
		int o= sc.nextInt();
		if((n<m)&&(n<o)) {
			System.out.println(n+ " is the smallest number");
		}
		if((m<n)&&(m<o)) {
			System.out.println(m+ " is the smallest number");
		}
		else if((o<n)&&(o<m)) {
			System.out.println(o+ " is the smallest number");
		}
		else {
			System.out.println("All numbers are same, Please enter different numbers");
		}
		System.out.println("Do you want to try again? (y/n)");
        choice = sc.next().charAt(0);
    }
while (choice == 'y' || choice == 'Y');
        
        sc.close();
	}
}

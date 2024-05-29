package com.Day2;

import java.util.Scanner;

public class DiscountRange {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		char choice;
do {
System.out.println("Enter the purchase amount");
int amount=sc.nextInt();
if(amount<500) {
	System.out.println("No discount for amount less than 500");
}
else if((amount>=500)&&(amount<=1000)) {
	amount=amount-((amount/100)*10);
	System.out.println(amount +" is the discounted price");
}
else if(amount>1000) {
	amount=amount-((amount/100)*20);
	System.out.println(amount +" is the discounted price");
}
	else {
		System.out.println("Enter the valid amount");
		}
System.out.println("Do you want to try again? (y/n)");
choice = sc.next().charAt(0);
	
}
while(choice == 'Y' || choice == 'y');
sc.close();
}	
}

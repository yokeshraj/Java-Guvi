package com.Day2;

public class ReversingNumber {
	public static void main(String[]args) {
		
	     int number= 876;
	     while(number!=0) {
	    	 int reversedNumber = 0; 

	       
	         while (number != 0) {
	             int digit = number % 10;
	             reversedNumber = reversedNumber * 10 + digit;  
	             number /= 10;  
	         }

	         
	         System.out.println("Reversed Number: " + reversedNumber);
	     }
		}
}

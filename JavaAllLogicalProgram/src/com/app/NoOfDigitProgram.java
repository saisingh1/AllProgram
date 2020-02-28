package com.app;

import java.util.Scanner;

public class NoOfDigitProgram {
	
	
	public static void main(String[] args) {
		Scanner sc;
		int Number, Count=0;
		Scanner sc1 = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc1.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits in a Given Number = %d", Count);
	}
}

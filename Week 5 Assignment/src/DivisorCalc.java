//********************************************************
//	DivisorCalc.java			Author: Ben Callen
//
//	Uses Euclid's algorithm to find the largest common
//	divisor of two positive integers
//********************************************************

import java.util.Scanner;

public class DivisorCalc {
	
	private static int gcd(int num1, int num2) {
		if (num2==0) {
			return num1;
		}
		return gcd(num2, num1%num2);
	}

	public static void main(String[] args) {
		
		int num1, num2, greatestCommonDivisor;
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		num1 = number.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = number.nextInt();
		
		greatestCommonDivisor = gcd(num1,num2); //calls method to calculate GCD
		
		System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " = " + greatestCommonDivisor);
		
		number.close();

	}

}

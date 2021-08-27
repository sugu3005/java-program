package org.oddoreven;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		System.out.println("enter your number:");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		if((i%2)==0) {
			System.out.println("the number "+ i +" is even number");
		}
		else {
			System.out.println("the number "+ i +" is odd number");
		}
	}

}

package com.patterns.program;

import java.util.Scanner;

public class HollowPattern {
	public static void main(String[] args) {
		int c,n,s,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for (r = 1;  r<=n; r++) {

			for(c=1;c<=n; c++) {
				if ( c==n ||r==n || c+r==n+1 ) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}
				
			}
			System.out.println();
		}
}
}

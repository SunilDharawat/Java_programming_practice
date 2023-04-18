package com.patterns.program;

import java.util.Scanner;

public class StarPattern {
public static void main(String[] args) {
	int n,r;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	n=sc.nextInt();
	for (r = 1;  r<=n; r++) {
		System.out.print("* ");
	}
	System.out.println();
	
	for (r = 0;  r<n; r++) {
		System.out.print("* ");	
	}
	System.out.println();
	for (r = n;  r>0; r--) {
		System.out.print("* ");
	}
	System.out.println();
	for (r = n-1;  r>=0; r--) {
		System.out.print("* ");	
	}
	
}
}

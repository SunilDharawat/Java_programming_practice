// Downward Triangle Pattern
package com.patterns.program;

import java.util.Scanner;

public class DownwardTrianglePattern {
public static void main(String[] args) {
	int n,r,s,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :");
	n=sc.nextInt();
	for (r=n; r>0; r--) {
//		for(s=n-r; s>0; s--) {
//			System.out.print(" ");
//		}
		for(s=1; s<=n-r; s++) {
			System.out.print(" ");
		}
		for(c=1; c<=r; c++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
//	PART TWO FOR RIGHT DOWN MIRROR STAR PATTERN
    for(r=1; r<=n; r++) {
    	for(s=2; s<=r; s++) {
    		System.out.print(" ");
    	}
    	for(c=1; c<=n-r+1; c++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
}
}

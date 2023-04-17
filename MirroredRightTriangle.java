package com.patterns.program;

import java.util.Scanner;
// Mirrored Right Triangle
public class MirroredRightTriangle{
public static void main(String[] args) {
	int n,r,s,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	n= sc.nextInt();
    
	for (r = 1;  r<=n; r++) {
//		for spacing 
		for(s=1; s<=n-r; s++) { 
			System.out.print(" ");
		}
//		for(s=n-r; s>=1; s--) { 
//			System.out.print(" ");
//		}
//		for star pattern
		for(c=1; c<=r; c++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}

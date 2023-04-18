package com.patterns.program;

import java.util.Scanner;

public class SandGlassHollowPattern {
 public static void main(String[] args) {
		int c,n,s,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
//		if (n%2==0) {
//			n=n+1;
//		}
//		for(r=1;r<=n;r++) {
//			for(c=1;c<=n; c++) {
////				if(r==1 || r==n || r==c || r+c==n+1)
//				if(r+c==n+1 || r==c || r==n || r==1  ){
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
//		SANDGLASS PATTERN
//		lengthy way to print the Sandglass pattern
		for(r=1; r<=n*2; r++) {
			if (r<=n) {
				for(s=2; s<=r; s++) {
					System.out.print(" ");
				}
				for(c=1; c<=n-r+1; c++) {
					System.out.print("* ");
				}
				System.out.println();
			}else{
				for(s=1; s<=n*2-r; s++) {
					System.out.print(" ");
				}
				for(c=1; c<=r-n; c++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
 
 
 
 
 
 
 
 }
}

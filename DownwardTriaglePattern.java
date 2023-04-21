package com.patterns.program;
// Left side angle downward triagle pattern
import java.util.Scanner;

public class DownwardTriaglePattern {
	public static void main(String[] args) {
		int n,r,s,c,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		n=sc.nextInt();
//		for(r=1;r<=n; r++) {
//			for(c=(n-r)+1; c>=1; c--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}


		for(r=1; r<=n*2-1; r++)
		{
			if(r<=n) {
				for(s=n; s>r; s--) {
					System.out.print(" ");
				}
				for(j=1; j<=r; j++) {
					System.out.print("* ");
				}
				
			}else if(r>n) {
				for(s=1; s<=r-n; s++) {
					System.out.print(" ");
				}
				for(j=(n*2-r); j>=1; j--) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	
	
	
	
	}
	}
	


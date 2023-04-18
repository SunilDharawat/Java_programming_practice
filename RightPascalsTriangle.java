package com.patterns.program;

import java.util.Scanner;

public class RightPascalsTriangle {
public static void main(String[] args) {
	int n,r,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :");
	n=sc.nextInt();
	for(r=1; r<=n*2-1; r++) {
		if (r<=n) {
			for(c=1; c<=r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}else{
			for(c=1; c<=n*2-r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
}

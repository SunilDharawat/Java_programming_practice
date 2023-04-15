package com.patterns.program;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		int n=5,r,c,nor=1,noc=(n*2)-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		
		for(r=1; r<=(n*2)-1; r++) {
			for(c=1; c<=(n*2)-1; c++) {
				if (c<=nor || c>=noc) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if (r<n) {
				nor++; noc++;
			} else {
                nor--; noc--;
			}
			System.out.println();
		}
	}

}

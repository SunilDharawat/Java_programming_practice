//Right Triangle Pattern
package com.patterns.program;

import java.util.Scanner;

// Nested loop example
public class RightTrianglePattern {
public static void main(String[] args) {
    int r,c,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
     n = sc.nextInt();
//     for (r = 1;  r<=n; r++) {
//    	 for (c = 1;  c<=r; c++) {
//			System.out.print("* ");
//		}
//	 System.out.println();
//	}
//     for (r = 0;  r<=n; r++) {
//    	 for (c = 0;  c<r; c++) {
//			System.out.print("* ");
//		}
//	 System.out.println();
//	}
     for (r = 1;  r<=n; r++) {
    	 for (c = r;  c>=1; c--) {
			System.out.print("* ");
		}
	 System.out.println();
	}
}
}

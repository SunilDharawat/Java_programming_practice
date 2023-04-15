package com.patterns.program;

public class DiamondPattern {
public static void main(String[] args) {
	int r,s,c,n=4;
	for (r=1;  r<=(n*2)-1; r++) {
    // Upper half(pyramid)
		if (r<=n) {
			for(s=n-r; s>=1; s--) {
				System.out.print(" ");
			}
			for(c=1; c<=r; c++) {
				System.out.print("* ");
			}
		} else {
            for(s=1; s<=r-n; s++) {
            	System.out.print(" ");
            }
            for(c=(n*2-r); c>=1; c--) {
            	System.out.print("* ");
            }
		}
	
		System.out.println();
	}
//	another way to print daimond pattern
	for(r=1; r<=n*2-1; r++) {
		if (r<=n) {
			for(s=1; s<=n-r; s++) {
				System.out.print(" ");
			}
			for(c=1; c<=r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}else{
			for(s=1; s<=r-n; s++) {
				System.out.print(" ");
			}
			for(c=1; c<=n*2-r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
}

package com.patterns.program;

public class KPattern {
	
	public static void main(String[] args) {
		int r,c,n=4;
		for (r=1;  r<=(n*2)-1; r++) {
	    // Upper half(pyramid)
			if (r<=n) {
				
				for(c=n; c>=r; c--) {
					System.out.print("*");
				}
			} else {
	           
	            for(c=1; c<=(r-n)+1; c++) {
	            	System.out.print("*");
	            }
			}
		
			System.out.println();
		}
		
	}
	}



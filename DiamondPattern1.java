
package com.patterns.program;

import java.util.Scanner;

public class DiamondPattern1 {
 public static void main(String[] args) {
	int r,c,s,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	n=sc.nextInt();
	 for(r=1; r<=n; r++) {
	    if (r<=n) {
	    	 for(s=n-r; s>0; s--) {
	    		 System.out.print(" ");
	    	 }
	         for(c=1; c<=r*2-1; c++) {
	        	 System.out.print("*");
	         }
	         System.out.println();
	    }else {

}
}	
    	
    
		
	
	
}
}

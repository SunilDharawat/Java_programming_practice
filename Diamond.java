package methods1;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int r, j, s, n = sc.nextInt();
		
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

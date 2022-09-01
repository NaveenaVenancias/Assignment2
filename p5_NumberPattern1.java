package java_assignment2;

import java.util.Scanner;

public class p5_NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			int value=row;
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			for(int col=n-row;col>=1;col--) {
				System.out.print("  ");
			}
			for(int col=n-row;col>=1;col--) {
				System.out.print("  ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print((value--)+" ");
			}
			System.out.println();
		}
	}

}

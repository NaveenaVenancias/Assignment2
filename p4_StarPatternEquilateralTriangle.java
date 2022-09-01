package java_assignment2;

import java.util.Scanner;

public class p4_StarPatternEquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}

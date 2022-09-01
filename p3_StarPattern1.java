package java_assignment2;

import java.util.Scanner;

public class p3_StarPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input:");
		int n=sc.nextInt();
		int row=1,temp=n;
		for(row=1;row<=n/2;row++) {
			for(int col=1;col<(2*row);col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row1=row;row<n;row1++) {
			temp=2;
			for(int col=0;col<temp;col++) {
				System.out.print("* ");
			}
		}
	}

}

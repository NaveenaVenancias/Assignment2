package java_assignment2;

import java.util.Scanner;

public class p1_ArmstrongOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value:");
		int n=sc.nextInt();
		int sum=0,digit;
		int temp=n;
		while(temp>0) {
			digit=temp%10;
			sum=sum+(digit*digit*digit);
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println(n+" is Armstrong Number");
		}
		else {
			System.out.println(n+" is not Armstrong Number");
		}
	}

}

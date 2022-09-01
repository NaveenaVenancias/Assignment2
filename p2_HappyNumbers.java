package java_assignment2;

import java.util.Scanner;

public class p2_HappyNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		int sum1=0,sum2=0,digit;
		int temp=i;
		while(temp!=0) {
			digit=temp%10;
			sum1=sum1+(digit*digit);
			temp=temp/10;
		}
		while(sum1!=0) {
			digit=sum1%10;
			sum2=sum2+digit;
			sum1=sum1/10;
		}
		if(sum2==1) {
			System.out.print(i+",");
		}
		
		}
	}

}

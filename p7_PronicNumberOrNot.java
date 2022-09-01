package java_assignment2;

import java.util.Scanner;

public class p7_PronicNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int  a=sc.nextInt();
		int result=0;
		for(int i=0;i<=a;i++) {
			if(i*(i+1)==a) {
				result=1;
				break;
			}
		}
		if(result==1) {
			System.out.println("This is pronic Number");
		}
		else {
			System.out.println("This is not pronic number");
		}
	}

}

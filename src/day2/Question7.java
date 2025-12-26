package day2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many number: ");
		int n=sc.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		
		System.out.print("Enter " +n+ " numbers: ");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			if(num%2==0) {
				sumEven+=num;
			}else {
				sumOdd+=num;
			}
		}
		System.out.println("Even sum: "+sumEven);
		System.out.print("Odd sum: "+sumOdd);

	}

}

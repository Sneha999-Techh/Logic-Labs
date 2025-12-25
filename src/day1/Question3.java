package day1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number: ");
		int num=sc.nextInt();
		
		boolean result=prime(num);
		if(result) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}
	
	public static boolean prime(int number) {
		if(number <= 1) {
	        return false;
	    }
		int div=2;
		while(div<number) {
			if(div%number==0) {
				return false;
			}
			div++;
		}
		return true;
	}

}

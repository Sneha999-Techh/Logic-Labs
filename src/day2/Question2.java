package day2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects: ");
		float m1=sc.nextFloat();
		float m2=sc.nextFloat();
		float m3=sc.nextFloat();
		float m4=sc.nextFloat();
		float m5=sc.nextFloat();
		
		double total=m1+m2+m3+m4+m5;
		double percentage=(total/500)*100;
		System.out.println("Percentage: "+percentage);
		
		if(percentage>=90) {
			System.out.println("Grade A");
		}else if(percentage>=75) {
			System.out.println("Grade B");
		}else if(percentage>=60) {
			System.out.println("Grade C");
		}else if(percentage>=40) {
			System.out.println("Grade D");
		}else if(percentage<40) {
			System.out.println("Grade F");
		}else {
			System.out.println("Enter valid input");
		}
		

	}

}

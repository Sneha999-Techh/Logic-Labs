package day1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter you string: ");
		String name=sc.nextLine();
		
		String result=reverse1(name);
		System.out.print("Reverse is: " +result);
		sc.close();

	}
	public static String reverse1(String name) {
		char [] arr=name.toCharArray();
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
		if(!Character.isLetter(arr[left])) {
			left++;
		}else if(!Character.isLetter(arr[right])) {
			right--;
		}else {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		
	}
		return new String(arr);
	}

}

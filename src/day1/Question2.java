package day1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		
		if(size == 0) {
            System.out.println("Array size is 0, no elements to compare!");
            return; 
        }
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter Element" +(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		

		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("The smallest element is: "+min);
		

	}

}

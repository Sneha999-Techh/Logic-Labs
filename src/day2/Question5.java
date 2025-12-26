package day2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("Enter element: "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		
		int max1,max2;
		if(arr[0]>arr[1]) {
			max1=arr[0];
			max2=arr[1];
		}else {
			max1=arr[1];
			max2=arr[0];
		}
		
		for(int i=2;i<=arr.length-1;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2 && arr[i] != max1){
				max2=arr[i];
			}
		}
		System.out.print("Second largest element is: "+max2);

	}

}

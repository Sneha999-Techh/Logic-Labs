package day2;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int result = factorial(n);  
	        System.out.println("Factorial of " + n + " is: " + result);

	        sc.close();
	    }

	    public static int factorial(int n) {
	        if(n == 0 || n == 1) {
	            return 1;
	        }
	        
	        return n * factorial(n - 1);
	    }
	}
	
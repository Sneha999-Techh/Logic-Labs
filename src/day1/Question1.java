package day1;
import java.util.*;

public class Question1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String: ");
		String name=sc.nextLine();
		
		String result=reverse(name);
		System.out.print("Reverse is: " +result);
		sc.close();

	}
	
	public static String reverse(String str) {
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		return rev;
	}

}

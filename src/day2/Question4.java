package day2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your string: ");
		String sentence=sc.nextLine();
		
		String result=reverse(sentence);
		System.out.println("Reversed words in String are: "+result);

	}
	public static String reverse(String sentence) {
		String resultString="";
		String[] wordss=sentence.split(" ");
		
		for(int i=0;i<=wordss.length-1;i++) {
			String word=wordss[i];
			String reverseWord="";
			
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord+=word.charAt(j);
			}
			resultString+=reverseWord +" ";
		}
		return resultString.trim();
		
	}

}

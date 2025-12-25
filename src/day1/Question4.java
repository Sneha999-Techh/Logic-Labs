package day1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String name = sc.nextLine();
        name=name.toLowerCase();
        
        int[] freq=new int[26];
        
        for(int i=0;i<name.length();i++) {
        	char ch=name.charAt(i);
        	
        	if(ch>='a' && ch<='z') {
        		freq[ch-'a']++;
        	}
        }
        
        for(int i=0;i<name.length();i++) {
        	if(freq[i]>0) {
        		System.out.print((char)(i+'a')+ ":" +freq[i]);
        	}
        }
        	
    }
	
}

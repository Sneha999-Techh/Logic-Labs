package day2;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter choice (CtoF or FtoC): ");
        String choice = sc.nextLine();   

        System.out.print("Enter Value: ");
        double value = sc.nextDouble();  
        
        double result = temp(choice, value); 
        System.out.println("Result = " + result);

        sc.close();
    }

    public static double temp(String choice, double value) {
        double result;

        if (choice.equalsIgnoreCase("CtoF")) { 
            result = (value * 9.0/5.0) + 32;   
            return result;
        } 
        else if (choice.equalsIgnoreCase("FtoC")) { 
            result = (value - 32) * 5.0/9.0;   
            return result;
        } 

        System.out.println("Invalid Choice!");
        return 0; 
    }
}

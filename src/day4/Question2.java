package day4;

import java.util.Scanner;

public class Question2 {
	
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double w) {
		if(w>0) {
			this.width=w;
		}
	}
	
	public void setHeight(double h) {
		if(h>0) {
			this.height=h;
		}
	}
	
	public double area() {
		return height*width;
	}
	
	public double perimeter() {
		return 2*(height+width);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter width: ");
		double widthR=sc.nextDouble();
		
		System.out.print("Enter height: ");
		double heightR=sc.nextDouble();
	
		Question2 r=new Question2();
		r.setWidth(widthR);
		r.setHeight(heightR);
		System.out.println(r.area());     
		System.out.println(r.perimeter()); 
		r.setWidth(0);
		System.out.println(r.getWidth());

	}

}

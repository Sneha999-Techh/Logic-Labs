package day4;

public class Question13 {
	
	private String name;
	private double salary;
	
	void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			System.out.println("Invalid name");
			return;
		}
		this.name=name;
		System.out.println("Name set to: "+name);
	}
	
	void setSalary(double s) {
		if(s>=10000 && s<=500000) {
			this.salary=s;
			System.out.println("Salary set to: "+s);
	}	else {
		System.out.println("Invalid salary");
	}
	}
	
	void raise(double percent) {
		if(percent>=0 && percent<=100) {
		double percentAmount = (percent/100)*salary;
		salary+=percentAmount;
		System.out.println("Salary after " +percent+ " percent increase: "+salary);

	} else {
		System.out.println("Invalid percent");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question13 e=new Question13();
		e.setName("");          // Invalid name
        e.setName("Sneha");     // Sets name
        e.setSalary(9000);      // Invalid salary
        e.setSalary(120000);    // Valid
        e.raise(10);            // 10% raise
        e.raise(200);            // Invalid
	
	}

}

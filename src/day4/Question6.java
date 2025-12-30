package day4;

public class Question6 {
	
	private String owner;
	private double balance;
	
	Question6(String owner,double balance){
		this.owner=owner;
		this.balance=balance;
		System.out.println("Owner: "+owner+ ", Balance: "+balance);
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println(amount+" is deposited");
		}
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println(amount+" is withdrawn");
		}else {
			System.out.println("Withdraw amount exceeds balance");
		}
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void applyFee(double fee) {
	    if(fee > 0 && fee <= balance) {
	        balance -= fee;
	    }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question6 acc = new Question6("Sneha", 1000.0);
		acc.deposit(500);
		acc.withdraw(300);
		System.out.println("Balance remaining: "+acc.getBalance()); 

	}

}

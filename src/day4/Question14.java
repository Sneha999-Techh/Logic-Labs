package day4;

public class Question14 {
	
	private final String digits;
	
	Question14(String digits){
		if(isValid(digits)) {
			this.digits=digits;
		}else {
			this.digits="000000000000";
			System.out.println("Invalid account number");
	}
	}
	
	public static boolean isValid(String s) {
		if(s.length()==12) {
			for(int i=0;i<s.length();i++) {
				if(!Character.isDigit(s.charAt(i))) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	String getDigits() {
		return digits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Question14 a = new Question14("123456789012"); 
	     System.out.println("Account A: " + a.getDigits());

	     Question14 b = new Question14("ABC"); 
	     System.out.println("Account B: " + b.getDigits());

	}

}

package day4;

public class Question8 {
	
	private final double celsius;
	
	Question8(double celsius){
		this.celsius=celsius;
	}
	
	public Question8 withCelsius(double newCelsius) {
		return new Question8(newCelsius);
	}
	
	public double toFahrenheit() {
		return (celsius*(9/5))+32;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question8 t = new Question8(25.0);
		System.out.println(t.toFahrenheit()); 
		Question8 t2 = t.withCelsius(30.0); 
		
		
	}

}

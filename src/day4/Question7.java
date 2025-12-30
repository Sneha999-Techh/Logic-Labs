package day4;

public class Question7 {
	
	private int value;
	public static int instances;
	
	Question7(){
		instances++;
	}
	
	void increment() {
		value++;
	}

	void decrement() {
		value--;
	}
	
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question7 a = new Question7();
		Question7 b = new Question7();
		Question7 c = new Question7();
		System.out.println(Question7.instances);

	}

}

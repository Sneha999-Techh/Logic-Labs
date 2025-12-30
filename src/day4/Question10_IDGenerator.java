package day4;

public class Question10_IDGenerator {
	
	private static int next=1000;
	
	public static int nextId() {
		return next++;
	}

}

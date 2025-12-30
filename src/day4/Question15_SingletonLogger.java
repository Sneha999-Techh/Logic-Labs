package day4;

public class Question15_SingletonLogger {
	
	private static Question15_SingletonLogger instance;
	private static final String PREFIX = "[APP] ";
	
	private Question15_SingletonLogger() {
	}
	
	public static Question15_SingletonLogger getInstance() {
		if(instance==null) {
			instance=new Question15_SingletonLogger();
		}
		return instance;
	}
	
	public void log(String msg) {
		System.out.println(PREFIX + msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Question15_SingletonLogger l1 = Question15_SingletonLogger.getInstance();
		 Question15_SingletonLogger l2 = Question15_SingletonLogger.getInstance();

	        // Verify single instance
	        System.out.println(l1 == l2); // true

	        l1.log("Started");  // [APP] Started
	        l2.log("Processing"); // [APP] Processing

	}

}

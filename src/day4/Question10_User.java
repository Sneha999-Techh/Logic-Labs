package day4;

public class Question10_User {
	
	final int id;
	private String name;
	
	Question10_User(String name){
		this.name=name;
		this.id=Question10_IDGenerator.nextId();
	}
	
	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question10_User u1=new Question10_User("Sneha");
		Question10_User u2=new Question10_User("Priya");
		System.out.println(u1.getId());
		System.out.println(u2.getId());
		

	}

}

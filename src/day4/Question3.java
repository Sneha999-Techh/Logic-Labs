package day4;

public class Question3 {
	
	final int id;
	private String name;
	
	Question3(int id){
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 s = new Question3(101);
		s.setName("Alice");
		System.out.println(s.getId());

	}

}

package day4;

public class Question11 {
	
	private String title;
	private String author;
	private boolean issued;
	
	public static int totalBooks;
	
	Question11(String title,String author){
		this.title=title;
		this.author=author;
		this.issued=false;
		totalBooks++;
	}
	
	public void issue() {
		if(!isIssued()) {
			this.issued=true;
			System.out.println(title+ " Issued successfully");
		}else {
			System.out.println(title+ " Already Issued, cannot issue again");
		}
		
		}
	
	public void returnBook() {
		if(isIssued()) {
			this.issued=false;
			System.out.println(title+" Book returned");
		}else {
			System.out.println(title+" Book is not issued! Cannot return");
		}
	}
	
	public boolean isIssued() {
		return issued;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question11 b = new Question11("1984", "Orwell");
		b.issue();      
		b.issue();      
		b.returnBook(); 
		System.out.println("Total books: "+Question11.totalBooks);

	}

}

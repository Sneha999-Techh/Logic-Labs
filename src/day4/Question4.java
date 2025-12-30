package day4;

public class Question4 {
	
	public static int max(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int clamp(int v, int min,int max) {
		if(v<min) {
			return min;
		}else if(v>max) {
			return max;
		}
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Question4.max(7, 3));        
        System.out.println(Question4.clamp(15, 0, 10));
        System.out.println(Question4.clamp(-3, -2, 5)); 
        System.out.println(Question4.clamp(4, 0, 10));  

	}

}

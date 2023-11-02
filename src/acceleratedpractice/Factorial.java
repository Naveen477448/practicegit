package acceleratedpractice;

public class Factorial {
	public static void main(String[] args) {
		
	
	int num=5;
	int res =1,i;
	for(i=2;i<=num;i++) {
		res*=i;
	}
	System.out.println("the factorial of" +num+ "is" +res);
	}
}

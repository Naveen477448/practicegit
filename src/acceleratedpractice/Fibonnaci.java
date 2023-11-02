package acceleratedpractice;

public class Fibonnaci {
	public static void main(String[] args) {
		int num =10;
		int num1 = 0,num2 =1;
		int counter = 0;
		
		while(counter<num) {
			System.out.println(num1+" ");
		
		int num3 = num2+num1;
		num1=num2;
		num2=num3;
		counter = counter+1;
		}
	}
	

}

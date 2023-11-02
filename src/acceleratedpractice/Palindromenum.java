package acceleratedpractice;

public class Palindromenum {
	public static void main(String[] args) {
		int num = 4224;
		int reversednum=0;
		int temp = num;
		
		while(temp>0) {
			int remainder = temp%10;
			reversednum = reversednum*10+remainder;
			temp/=10;
		}
		if(num==reversednum) {
			System.out.println(num+ " is a palindrome");
		}
		else {
			System.out.println(num+ "is not a palindrome");
		}
		
	}

}

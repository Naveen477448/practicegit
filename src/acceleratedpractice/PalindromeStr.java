package acceleratedpractice;

public class PalindromeStr {
	public static void main(String[] args) {
		String str = "malayalam",reversestr = "";
		int StrLength = str.length();
		
		for(int i=(StrLength-1);i>=0;--i) {
			reversestr = reversestr+str.charAt(i);
		}
		if(str.toLowerCase().equals(reversestr.toLowerCase())) {
			System.out.println(str+ "is a palindrome");
		}
		else {
			System.out.println(str+ "is not a palindrome");
		}
		}
	}



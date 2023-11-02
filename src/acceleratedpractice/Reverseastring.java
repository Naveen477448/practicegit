package acceleratedpractice;

public class Reverseastring {
	public static void main(String[] args) {
		String str = "java";
		String Reversestr ="";
		
		for(int i=0;i<str.length();i++) {
			Reversestr = str.charAt(i)+Reversestr;
		}
		System.out.println(Reversestr);
	}

}

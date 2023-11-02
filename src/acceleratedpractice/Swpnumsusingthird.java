package acceleratedpractice;

public class Swpnumsusingthird {
	public static void main(String[] args) {
		int first =100;
		int second = 150;
		
		System.out.println("before swap-----------");
		System.out.println("first num"+first);
		System.out.println("second num"+second);
		
		int third = first;
		first=second;
		second=third;
		
		System.out.println("after swap------------");
		System.out.println("first num "+first);
		System.out.println("second num"+second);
	}

}

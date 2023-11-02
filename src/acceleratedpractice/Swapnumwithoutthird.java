package acceleratedpractice;

public class Swapnumwithoutthird {
	public static void main(String[] args) {
		int first =100;
		int second =50;
		
		System.out.println("before swap ------------");
		System.out.println("first num-"+first);
		System.out.println("secondnum-"+second);
		
		first = first-second;
		second = first+second;
		first = second-first;
		
		System.out.println("after swap ---------------");
		System.out.println("first num-"+first);
		System.out.println("second num-"+second);
	}

}

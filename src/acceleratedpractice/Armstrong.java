package acceleratedpractice;

public class Armstrong {
	public static void main(String[] args) {
		int num = 370;
		int temp=num;
		int total =0;
		
		while(temp>0) {
			int r = temp%10;
			total = (r*r*r)+total;
			temp = temp/10;
		}
		if(num==total) {
			System.out.println(num+ "is a armstrong");
		}
		else {
			System.out.println(num+ "is not a armstrong");
			System.out.println("naveen is a human");
			System.out.println("jack is a dog");
		}
	}

}

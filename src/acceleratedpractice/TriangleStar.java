package acceleratedpractice;
import java.util.Scanner;

public class TriangleStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows to be printed");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
